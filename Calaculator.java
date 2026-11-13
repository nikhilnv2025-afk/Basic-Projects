import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
Scanner input = new Scanner(System.in);

int num1,num2;
System.out.println("Enter the first number: ");
num1 = input.nextInt();
System.out.println("Enter the second number: ");
num2=input.nextInt();

String operation;
System.out.println("Enter the operation (+, -, *, /): ");
operation = input.next();

switch (operation) {
    case "+":
        System.out.println("Result: " + (num1 + num2));
        break;
    case "-":
        System.out.println("Result: " + (num1 - num2));
        break;
    case "*":
        System.out.println("Result: " + (num1 * num2));
        break;  
    case "/":
        if (num2!= 0) {
            System.out.println("Result: " + (1.0 * num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        break;
    default:
        System.out.println("Error: Invalid operation.");
        break;

    }
}
}