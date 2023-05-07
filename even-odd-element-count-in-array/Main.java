public class Main {

    static void countOfEvenOddElement(int[] array) {
        int evenCounter = 0, oddCounter = 0;
        for (int i : array) {
            if (i % 2 == 0)
                evenCounter++;
            else
                oddCounter++;
        }
        System.out.println("Even Element count is "+evenCounter);
        System.out.println("Odd element count is "+oddCounter);

    }

    public static void main(String[] args) {
        int[] array = new int[]{1,5,6,2,8,7,9};
        countOfEvenOddElement(array);
    }

}