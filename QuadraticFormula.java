import java.util.Scanner;

/**
 * program that finds the roots of a quadratic equation after inputting coefficients
 * @author Suyash Patel
 */
public class QuadraticFormula {
    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a = getValidInput("a (coefficient of x^2): ", scanner);
        double b = getValidInput("b (coefficient of x): ", scanner);
        double c = getValidInput("c (constant coefficient): ", scanner);
        
        double discriminant = (b * b) - ((2 * 2) * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1: " + realPart + " + "  + "i" + "(" + imaginaryPart + ")");
            System.out.println("Root 2: " + realPart + " - "  + "i" + "(" + imaginaryPart + ")");
        }
    }

    private static double getValidInput(String prompt, Scanner scanner) {
        double input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or decimal.");
                scanner.next();
            }
        }
        return input;
    }
}



