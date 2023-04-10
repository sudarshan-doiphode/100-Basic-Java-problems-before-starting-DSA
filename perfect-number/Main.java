public class Main {

    static String isPerfectNumber(int num) {
        int i = 1 ;
        int sum = 0;
        while (i <= num / 2) {
            if (num % i == 0)
                sum += i;
            i++;
        }
        if (sum == num)
            return "Perfect Number";
        else
            return "Not A Perfect Number";
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

}
