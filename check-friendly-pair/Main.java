
public class Main {

    static String isFriendlyPair(int num1, int num2) {
        int sum1 = getSumOfNumber(num1);
        int sum2 = getSumOfNumber(num2);

        if (sum1 / num1 == sum2 / num2)
            return "Friendly pair";
        else
            return "Not Friendly pair";

    }

    private static int getSumOfNumber(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num / 2) {
            if (num % i == 0)
                sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isFriendlyPair(6, 12));
    }
}
