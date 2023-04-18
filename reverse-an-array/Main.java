public class Main {

    static int[] reverseArray(int arr[]) {
        int newArray[] = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int array[] = {40, 5, 6, 3, 12, 1};
        int reversedArray[] = reverseArray(array);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }

}
