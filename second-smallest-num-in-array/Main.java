public class Main {

    static int secondSmallestInArray(int[] array) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(first>array[i]){
                second = first;
                first = array[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int array[] = {12,3,2,14,15,1,0};
        System.out.println(secondSmallestInArray(array));
    }

}
