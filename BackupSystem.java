import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class BackupSystem extends JFrame {
    private JTextArea logTextArea;
    private File backupDirectory;

    public BackupSystem() {
        setTitle("Backup System");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton backupButton = new JButton("Backup");
        backupButton.addActionListener(new BackupActionListener());

        JButton restoreButton = new JButton("Restore");
        restoreButton.addActionListener(new RestoreActionListener());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(backupButton);
        buttonPanel.add(restoreButton);

        logTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(logTextArea);

        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    private void backupFiles() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setMultiSelectionEnabled(true);
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            for (File selectedFile : selectedFiles) {
                // Determine destination file path in backup directory
                String destinationPath = backupDirectory.getAbsolutePath() + File.separator + selectedFile.getName();
                File destinationFile = new File(destinationPath);
                // Copy selected file/directory to backup directory
                try {
                    if (selectedFile.isDirectory()) {
                        copyDirectory(selectedFile, destinationFile);
                    } else {
                        copyFile(selectedFile, destinationFile);
                    }
                    logTextArea.append("Backup completed for: " + selectedFile.getAbsolutePath() + "\n");
                } catch (IOException ex) {
                    logTextArea.append("Error backing up " + selectedFile.getAbsolutePath() + ": " + ex.getMessage() + "\n");
                }
            }
        }
    }

    private void copyDirectory(File sourceDirectory, File destinationDirectory) throws IOException {
        if (!destinationDirectory.exists()) {
            destinationDirectory.mkdirs();
        }
        File[] files = sourceDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    copyDirectory(file, new File(destinationDirectory, file.getName()));
                } else {
                    copyFile(file, new File(destinationDirectory, file.getName()));
                }
            }
        }
    }

    private void copyFile(File sourceFile, File destinationFile) throws IOException {
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }

    private void restoreFiles() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setMultiSelectionEnabled(true);
        int result = fileChooser.showOpenDialog(this);
    
        if (result == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            for (File selectedFile : selectedFiles) {
                // Determine the original location of the file based on its name or metadata
                // You can prompt the user to select the destination directory or implement logic to determine it programmatically
                File destinationDirectory = new File("C:\\path\\to\\restore\\files");
                try {
                    if (selectedFile.isDirectory()) {
                        copyDirectory(selectedFile, new File(destinationDirectory, selectedFile.getName()));
                    } else {
                        copyFile(selectedFile, new File(destinationDirectory, selectedFile.getName()));
                    }
                    logTextArea.append("Restored file: " + selectedFile.getAbsolutePath() + "\n");
                } catch (IOException ex) {
                    logTextArea.append("Error restoring " + selectedFile.getAbsolutePath() + ": " + ex.getMessage() + "\n");
                }
            }
        }
    }
    

    private class BackupActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            backupFiles();
        }
    }

    private class RestoreActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            restoreFiles();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BackupSystem());
    }
}
