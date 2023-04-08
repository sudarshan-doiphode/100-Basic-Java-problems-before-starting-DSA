
public class Main {

    static String isArmstrong(int num) {
        int temp = num;
        double sum = 0, digit;
        String len = Integer.toString(num);
        int size = len.length();
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + Math.pow(digit, size);
            temp /= 10;
        }
        if (sum == num)
            return "ArmStrong Number";
        else
            return "Not Armstrong";
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
