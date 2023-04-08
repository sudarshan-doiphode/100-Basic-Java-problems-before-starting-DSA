public class Main {

    private static String checkLeapYear(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
            return "Leap Year";
        else
            return "Not a Leap Year";
    }

    public static void main(String[] args) {
        System.out.println(checkLeapYear(2003));
    }
}