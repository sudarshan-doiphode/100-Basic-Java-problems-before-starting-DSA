import java.util.ArrayList;
import java.util.List;

public class Main{
    static List primeNumbers(int start, int end){
        List<Integer> list = new ArrayList<>();
        for(int i = start; i<=end; i++){
            int count = 0;
            for(int j =2 ; j<=i/2; j++){
                if(i%j==0)
                count++;
            }
            if(count == 0 && i>1)
            list.add(i);
        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println(primeNumbers(1,100));
    }
}