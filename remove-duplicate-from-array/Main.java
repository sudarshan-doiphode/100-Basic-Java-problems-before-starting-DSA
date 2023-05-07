import java.util.HashSet;

public class Main {

    static void removeDuplicateElementFromArray(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int i : set) {
            newArray[index] = i;
            index++;
        }
        System.out.println("new Arrays is");
        for (int i : newArray) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 10, 10, 5, 1, 32 };
        removeDuplicateElementFromArray(array);
    }

}
