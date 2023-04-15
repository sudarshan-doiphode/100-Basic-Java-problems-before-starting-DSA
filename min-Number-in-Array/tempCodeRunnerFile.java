public class Main {

    static int minNumberInArray(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i])
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 14, 5, 7, 1, 14, 13, 12 };
        System.out.println(minNumberInArray(arr));
    }

}
