package assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Factorial");
            System.out.println("2. Area of Circle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            
            Processor processor = null;
            
            switch (choice) {
                case 1:
                    processor = new Factorial();
                    processor.process();
                    processor.showData();
                    break;
                case 2:
                    processor = new Circle();
                    processor.process();
                    processor.showData();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
