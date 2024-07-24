package assignment1;

import java.util.Scanner;

class Factorial extends Processor {
    @Override
    void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        data = factorial;
    }
}