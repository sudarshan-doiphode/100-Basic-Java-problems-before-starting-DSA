public class Main{
    static void fibonacciSeries(int num){
        int first = 0;
        int second = 1;
        int nextNumber;
        System.out.print(first + " " + second+ " ");
        for(int i = 1; i<=num; i++){
            nextNumber = first + second;
            first = second;
            second = nextNumber;
            System.out.print(nextNumber + " ");
        }
    }
    public static void main(String[] args) {
        fibonacciSeries(10);
    }
}