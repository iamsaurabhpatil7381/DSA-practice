// public class Armstrong {
//     public static void main(String[] args) {
        


//     }
    
// }


public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int power = String.valueOf(num).length();
        int total = 0;

        while (num > 0) {
            int digit = num % 10;
            total += Math.pow(digit, power);
            num /= 10;
        }

        return total == originalNum;
    }

    public static void findArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int startRange = 100;
        int endRange = 1000;
        findArmstrongNumbers(startRange, endRange);
    }
}