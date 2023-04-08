public class Main {

    static int reverseNumber(int num) {
        String newNumber = "";
        while (num != 0) {
            newNumber = newNumber + num % 10;
            num /= 10;
        }
        int n = Integer.parseInt(newNumber);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }
}
