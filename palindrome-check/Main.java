
public class Main {

    static String checkpalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }
        if (reverse == num)
            return "Palindrome";
        else
            return "Not palindrome";
    }

    public static void main(String[] args) {
        System.out.println(checkpalindrome(121));
    }

}
