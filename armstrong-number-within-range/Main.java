import java.util.List;

public class Main {

    static void getAllArmstrongNumbers(int start, int end){
        for(int i = start; i<= end; i++){
            int sum = 0;
            int temp = i;
            String calLength = Integer.toString(i);
            int size = calLength.length();
            while(temp!=0){
                sum += Math.pow(temp%10, size);
                temp /=10;
            }
            if(sum == i){
                System.out.println("Palindrome :"+i);
            }
        }
    }

    public static void main(String[] args) {
        getAllArmstrongNumbers(1, 180);
    }
    
}
