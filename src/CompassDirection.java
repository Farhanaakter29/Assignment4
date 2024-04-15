//exercise 5.11
import java.util.*;
public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle (in degrees): ");
        int angle = scanner.nextInt();
        String direction = getCompassDirection(angle);
        System.out.println("Nearest compass direction: " + direction);
    }

    public static String getCompassDirection(int angle) {
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int[] angles = {0, 45, 90, 135, 180, 225, 270, 315};
        angle = (angle % 360 + 360) % 360;
        int minDifference = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < angles.length; i++) {
            int difference = Math.abs(angle - angles[i]);
            if (difference < minDifference) {
                minDifference = difference;
                index = i;
            }
        }
        if (index == 1 || index == 3 || index == 5 || index == 7) {
            return directions[index];
        } else {
            if (angle < 45 || angle >= 315) {
                return "N";
            } else if (angle >= 45 && angle < 135) {
                return "E";
            } else if (angle >= 135 && angle < 225) {
                return "S";
            } else {
                return "W";
            }
        }
    }
}