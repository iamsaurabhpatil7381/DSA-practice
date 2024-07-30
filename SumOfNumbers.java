import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int userInput;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            userInput = sc.nextInt();

            if (userInput == 0) {
                break;  // Exit the loop if the user enters 0
            }

            sum += userInput;
        }

        System.out.println("Sum of entered numbers: " + sum);

        
    }
}

