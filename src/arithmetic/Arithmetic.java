package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        // Get the values of x and y
        System.out.println("Enter the value of x: ");
        double x = in.nextDouble();
        System.out.println("Enter the value of y: ");
        double y = in.nextDouble();

        // Get the arithmetic operation
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationStr = in.next();

        // Convert String to Operation enum
        Operation operation = Operation.valueOf(operationStr.toUpperCase());

        double result = r.calculate(x, y, operation);
        System.out.println("result: " + result);
    }
}