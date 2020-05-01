package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        int minNumber = 2147483647;         // The highest value for integer
        int maxNumber = -2147483648;        // The lowest value for integer
        int checkNumber;
        int counter = 1;
//        boolean first = true;

        while (true) {
            System.out.print("Enter number #" + counter + ": ");
            counter++;

            boolean hasIntVal = scanInput.hasNextInt();

            if (hasIntVal) {
                checkNumber = scanInput.nextInt();

//                if (first) {
//                    minNumber = checkNumber;
//                    maxNumber = checkNumber;
//                    first = false;
//                }
                if (checkNumber > maxNumber) {
                    maxNumber = checkNumber;
                }
                if (checkNumber < minNumber) {
                    minNumber = checkNumber;
                }
            } else {
                break;
            }
            scanInput.nextLine();
        }
        System.out.println("------------------------");
        System.out.println("The min number is " + minNumber);
        System.out.println("The max number is " + maxNumber);
        scanInput.close();
    }
}
