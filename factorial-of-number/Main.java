
public class Main {

    static int getFactorialOfNumber(int num){
        int fact =1;
        for(int i = num; i>=1 ; i--){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(getFactorialOfNumber(5));
    }
}
