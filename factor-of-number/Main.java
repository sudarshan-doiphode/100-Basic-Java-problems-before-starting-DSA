import java.util.ArrayList;
import java.util.List;

public class Main {

    static List getFactorsOfNumber(int num) {
        int i = 1;
        List<Integer> list = new ArrayList<>();
        while (i <= num / 2) {
            if (num % i == 0) {
                list.add(i);
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getFactorsOfNumber(10));
    }
}
