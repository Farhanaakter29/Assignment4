//exercise 5.20
import java.util.*;
public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.next();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input must be a single letter from the alphabet.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (isVowel(ch)) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
