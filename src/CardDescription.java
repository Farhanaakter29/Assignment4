//exercise 5.16
import java.util.*;
class Card {
    private String notation;
    public Card(String notation) {
        this.notation = notation;
    }
    public String getDescription() {
        if (notation.length() != 2) {
            return "Unknown";
        }
        char value = notation.charAt(0);
        char suit = notation.charAt(1);
        String valueDescription;
        switch (value) {
            case 'A':
                valueDescription = "Ace";
                break;
            case '2', '3', '4', '5', '6', '7', '8', '9', 'T':
                valueDescription = String.valueOf(value);
                break;
            case 'J':
                valueDescription = "Jack";
                break;
            case 'Q':
                valueDescription = "Queen";
                break;
            case 'K':
                valueDescription = "King";
                break;
            default:
                return "Unknown";
        }
        String suitDescription;
        switch (suit) {
            case 'D':
                suitDescription = "Diamonds";
                break;
            case 'H':
                suitDescription = "Hearts";
                break;
            case 'S':
                suitDescription = "Spades";
                break;
            case 'C':
                suitDescription = "Clubs";
                break;
            default:
                return "Unknown";
        }

        return valueDescription + " of " + suitDescription;
    }
}
public class CardDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String notation = scanner.nextLine();
        Card card = new Card(notation);
        String description = card.getDescription();
        System.out.println(description);
    }
}

