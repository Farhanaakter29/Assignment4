//exercise 5.19
import java.util.*;
public class DecimalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (compareDecimal(num1, num2)) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }
    public static boolean compareDecimal(double num1, double num2) {
        int rounded1 = (int) (num1 * 100);
        int rounded2 = (int) (num2 * 100);
        return rounded1 == rounded2;
    }
}

