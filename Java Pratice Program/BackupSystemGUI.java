import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.nio.file.Files;
import java.io.IOException;


public class BackupSystemGUI extends JFrame {
    private JFileChooser sourceChooser;
    private JFileChooser backupChooser;

    public BackupSystemGUI() {
        setTitle("Backup System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        sourceChooser = new JFileChooser();
        sourceChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        backupChooser = new JFileChooser();
        backupChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        JButton startButton = new JButton("Start Backup");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sourcePath = getSourceDirectory();
                String backupPath = getBackupDirectory();
                startBackupMonitoring(sourcePath, backupPath);
            }
        });

        add(new JLabel("Select Source Directory:"));
        add(sourceChooser);
        add(new JLabel("Select Backup Directory:"));
        add(backupChooser);
        add(startButton);

        setVisible(true);
    }

    private String getSourceDirectory() {
        int result = sourceChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            return sourceChooser.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

    private String getBackupDirectory() {
        int result = backupChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            return backupChooser.getSelectedFile().getAbsolutePath();
        }
        return null;
    }

    private void startBackupMonitoring(String sourcePath, String backupPath) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (sourcePath == null || backupPath == null) {
                    // Handle the case where sourcePath or backupPath is null
                    System.err.println("Source path or backup path is null");
                    return;
                }
                File sourceDir = new File(sourcePath);
                File backupDir = new File(backupPath);
            
                // Get list of files in backup directory
                File[] backupFiles = backupDir.listFiles();
            
                // Iterate through backup files
                for (File backupFile : backupFiles) {
                    String sourceFilePath = sourceDir.getAbsolutePath() + File.separator + backupFile.getName();
                    File sourceFile = new File(sourceFilePath);
            
                    // If file exists in backup but not in source, it's deleted
                    if (!sourceFile.exists()) {
                        // Prompt user for confirmation
                        int choice = JOptionPane.showConfirmDialog(null,
                                "File '" + backupFile.getName() + "' has been deleted. Do you want to restore it?",
                                "File Deletion Detected", JOptionPane.YES_NO_OPTION);
            
                        // If user confirms, restore the file
                        if (choice == JOptionPane.YES_OPTION) {
                            try {
                                Files.copy(backupFile.toPath(), sourceFile.toPath());
                                JOptionPane.showMessageDialog(null, "File '" + backupFile.getName() + "' restored successfully.");
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "Error restoring file '" + backupFile.getName() + "'");
                            }
                        }
                    }
                }
            }
            
        }, 0, 5000); // Check every 5 seconds, adjust as needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BackupSystemGUI();
            }
        });
    }
}
