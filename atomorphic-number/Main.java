public class Main {

    static String isAtomorphic(int number) {
        int temp = number;
        int square = temp * temp;
        int counter = 0, digit;

        while (temp != 0) {
            digit = temp % 10;
            temp /= 10;
            counter++;
        }

        int remainder = (int) ((int) square % (Math.pow(10, counter)));
        if (remainder == number)
            return "Automorphic";
        else
            return "Not Automorphic";

    }

    public static void main(String[] args) {
        System.out.println(isAtomorphic(376)); 
    }

}
