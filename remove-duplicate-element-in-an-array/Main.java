import java.util.*;

public class Main {

    static int[] removeDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArray[index] = num;
            index++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 5, 6, 8, 8, 8};
        int[] newArr = removeDuplicate(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
