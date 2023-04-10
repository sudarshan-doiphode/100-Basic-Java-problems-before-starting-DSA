public class Main {

    static String isAbundant(int num) {
        int i = 1, sum = 0;
        while (i <= num / 2) {
            if (num % i == 0)
                sum += i;
            i++;
        }
        if (sum > num)
            return "Abundant Number";
        else
            return "Not Abundant Number";
    }

    public static void main(String[] args) {
        System.out.println(isAbundant(12));
    }
}