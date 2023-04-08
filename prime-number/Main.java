public class Main {
    private static String checkPrime(int number) {
        int count = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i != 0)
                count++;
        }
        if (count != 0)
            return "Not Prime";
        else
            return "Prime";
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(6));
    }
}
