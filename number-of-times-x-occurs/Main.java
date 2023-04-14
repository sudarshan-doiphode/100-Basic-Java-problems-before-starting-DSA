public class Main {

    static int countXOccurs(long num, char charcterLookingFor) {
        String givenString = Long.toString(num);
        int count = 0;
        for (int i = 0; i < givenString.length(); i++) {
            if (givenString.charAt(i) == charcterLookingFor)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countXOccurs(1534983253214L, '5'));
    }

}
