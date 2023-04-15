public class Main {

    static int maxNumInArray(int[] arr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 4, 5, 65, 99 };
        System.out.println(maxNumInArray(arr));
    }
}