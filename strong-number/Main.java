
public class Main {

    static String isStrongNumber(int num){
        int temp = num;
        int digit, sum =0;
        while(temp!=0){
            int fact = 1;
            digit = temp %10;
            while(digit!=0){
                fact = fact * digit;
                digit --;
            }
            sum = sum +fact;
            temp /=10;
        }

        if(sum == num)
        return "Strong Number";
        else
        return "Not Strong";
    }

    public static void main(String[] args) {
        System.out.println(isStrongNumber(145));
    }
    
}
