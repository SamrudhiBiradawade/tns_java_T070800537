package assignment1;

import java.util.Scanner;

class Circle extends Processor {
    @Override
    void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
        
        double area = Math.PI * radius * radius;
        data = (int) area; // Since data is int type
    }
}