public class Main{

    private static void getFirstNNaturalNumbers(int number){
         int i =0;
         int sum = 0;
         while(i!=10){
            sum += i;
            i++;
         }
         System.out.println("Sum of Given Natural Number is :"+sum);
    }

    public static void main(String[] args) {
        getFirstNNaturalNumbers(10);
    }
}