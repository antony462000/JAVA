import arithmetic.ArithmeticOperations;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
  System.out.println("Name : Antony Cyriac Thekkedath");
   System.out.println("Register No.: SJC22MCA-2010");
   System.out.println("Course Name : OBJECT ORIENTED PROGRAMMING LAB");
   System.out.println("Course Code : 20MCA132");
   System.out.println("Date :26/06/2023");
        ArithmeticOperations operations = new ArithmeticOperations();

       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Addition: " + operations.add(num1, num2));
        System.out.println("Subtraction: " + operations.subtract(num1, num2));
        System.out.println("Multiplication: " + operations.multiply(num1, num2));
        System.out.println("Division: " + operations.divide(num1, num2));
        
    }
}

