package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        int maxNumber = 0;
        int checkNumber;
        int counter = 1;

        while (true) {
            System.out.print("Enter number #" + counter + ": ");
            counter++;

            boolean hasIntVal = scanInput.hasNextInt();

            if (hasIntVal) {
                checkNumber = scanInput.nextInt();
                if (checkNumber > maxNumber) {
                    maxNumber = checkNumber;
                }
            } else {
                System.out.println("Invalid Value");
                break;
            }
            scanInput.nextLine();
        }
        System.out.println("The max number is " + maxNumber);
        scanInput.close();;
    }
}
