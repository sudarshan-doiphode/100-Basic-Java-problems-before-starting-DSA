import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void primeNumbersWithinRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean status = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    status = false;
                    break;
                }
            }
            if (status && i > 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
        primeNumbersWithinRange(2, 100);
    }
}
