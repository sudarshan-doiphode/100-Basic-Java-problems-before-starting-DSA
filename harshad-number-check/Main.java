public class Main {

    static String isHarshadNumber(int number) {
        int sum = 0, digit, num = number;
        while (num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        if (number % sum == 0)
            return "harshad Number";
        else
            return "Not a Harshad Number";
    }

    public static void main(String[] args) {
        System.out.println(isHarshadNumber(348));
    }

}
