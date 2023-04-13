public class Main{

    static int hcfOfNumber(int num1 , int num2){
        int max, i =1, hcf = 0;
        if(num1 > num2)
        max = num1;
        else 
        max = num2;

        while(i<=max/2){
            if(num1%i == 0 && num2 % i ==0)
            hcf = i;
            i++;
        }
        return hcf;
    }

    public static void main(String[] args) {
        System.out.println(hcfOfNumber(36, 60));
    }
}
