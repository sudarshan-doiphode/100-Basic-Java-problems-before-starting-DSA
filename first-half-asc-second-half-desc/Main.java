import java.util.Arrays;

public class Main {

    static void firstHalfAscSecondHalfDesc(int[] array) {
        Arrays.sort(array);

        System.out.println("First Half");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("--------------");
        System.out.println("Second Half");
        for (int j = array.length - 1; j >= array.length / 2; j--) {
            System.out.print(array[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 12, 14, 13, 1233, 2, 4, 24, 5 };
        firstHalfAscSecondHalfDesc(array);
    }
}
