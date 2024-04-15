//exercise 5.17
import java.util.*;
public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is " + largest);
    }
    public static double findLargest(double num1, double num2, double num3) {
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
}

