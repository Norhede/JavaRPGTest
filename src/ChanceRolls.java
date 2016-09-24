import java.util.Random;

/**
 * Created by Henrik on 24-09-2016.
 */
public class ChanceRolls {
    static Random rand = new Random();

    public static int rollNumber(int minimumValue, int maximumValue) {
        return rand.nextInt((maximumValue - minimumValue) + 1) + minimumValue;
    }
}
