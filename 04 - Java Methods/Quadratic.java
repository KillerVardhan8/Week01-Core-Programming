import java.util.Scanner;
import java.util.Arrays;

public class Quadratic {
    public static String quadratic(int a, int b, int c) {
        // Case 1: When `a == 0`, the equation is not quadratic
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Infinite solutions (0 = 0)."; // Infinite solutions case
                } else {
                    return "No solution exists."; // Invalid equation case
                }
            } else {
                // Linear equation: bx + c = 0
                double root = -1.0 * c / b;
                return "Linear equation root: " + root;
            }
        }

        // Case 2: Quadratic equation (a != 0)
        double delta = (double) Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Real roots: " + root1 + ", " + root2;
        } else if (delta == 0) {
            // One repeated real root
            double root = -b / (2.0 * a);
            return "Repeated root: " + root;
        } else {
            // Complex roots
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            return "Complex roots: " + realPart + " + " + imaginaryPart + "i, " +
                    realPart + " - " + imaginaryPart + "i";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficient of 'x^2' (a):");
        int a = input.nextInt();

        System.out.println("Enter the coefficient of 'x' (b):");
        int b = input.nextInt();

        System.out.println("Enter the constant value (c):");
        int c = input.nextInt();

        String result = Quadratic.quadratic(a, b, c);
        System.out.println("Result: " + result);
    }
}