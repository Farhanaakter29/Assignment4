//exercise 5.15
import java.util.*;
public class IncomeTaxCalculate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();
        double tax = calculateIncomeTax(income);
        System.out.println("Your income tax is: $" + tax);
    }
    public static double calculateIncomeTax(double income) {
        double tax = 0.0;
        if (income <= 50000) {
            tax = income * 0.01;
        } else if (income <= 75000) {
            tax = 500 + (income - 50000) * 0.02;
        } else if (income <= 100000) {
            tax = 1000 + (income - 75000) * 0.03;
        } else if (income <= 250000) {
            tax = 1750 + (income - 100000) * 0.04;
        } else if (income <= 500000) {
            tax = 6750 + (income - 250000) * 0.05;
        } else {
            tax = 18750 + (income - 500000) * 0.06;
        }
        return tax;
    }
}

