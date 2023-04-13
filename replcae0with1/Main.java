
public class Main {

    static int replacedNumber(int number) {
        String oldNumber = Integer.toString(number);
        String newNumber = "";
        for (int i = 0; i < oldNumber.length(); i++) {
            if (oldNumber.charAt(i) == '0') {
                newNumber += '1';
            } else {
                newNumber += oldNumber.charAt(i);
            }
        }
        int replacedNumber = Integer.parseInt(newNumber);
        return replacedNumber;
    }

    public static void main(String[] args) {
        System.out.println(replacedNumber(102013));
    }
}
