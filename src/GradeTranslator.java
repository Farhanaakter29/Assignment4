//exercise 5.13
import java.util.*;
class Grade {
    public double getNumericGrade(String letterGrade) {
        double numericGrade = 0.0;
        switch (letterGrade.charAt(0)) {
            case 'A':
                numericGrade = 4.0;
                break;
            case 'B':
                numericGrade = 3.0;
                break;
            case 'C':
                numericGrade = 2.0;
                break;
            case 'D':
                numericGrade = 1.0;
                break;
            case 'F':
                numericGrade = 0.0;
                break;
            default:
                System.out.println("Invalid grade!");
                return numericGrade;
        }
        if (letterGrade.length() > 1) {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                numericGrade += 0.3;
            } else if (modifier == '-') {
                if (numericGrade == 4.0) {
                    numericGrade = 3.7; // Special case: A- is 3.7
                } else {
                    numericGrade -= 0.3;
                }
            } else {
                System.out.println("Invalid grade modifier!");
            }
        }

        return numericGrade;
    }
}
public class GradeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letterGrade = scanner.next();
        Grade grade = new Grade();
        double numericGrade = grade.getNumericGrade(letterGrade);
        System.out.println("The numeric value is " + numericGrade);
    }
}

