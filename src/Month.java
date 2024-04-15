//exercise 5.21
import java.util.*;
public class Month {
    private int monthNumber;
    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }
    public int getLength() {
        int days;
        switch (monthNumber) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        return days;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int monthNumber = scanner.nextInt();

        Month month = new Month(monthNumber);
        int days = month.getLength();
        System.out.println(days + " days");
    }
}

