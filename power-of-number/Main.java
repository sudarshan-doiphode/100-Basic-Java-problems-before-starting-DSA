public class Main {

    static int getPowerOfNumber(int number, int exponent){
        int power =1;
        while(exponent>0){
            power *= number; 
            exponent--;
        }
        return power;
    }
    
    public static void main(String[] args) {
        System.out.println(getPowerOfNumber(2, 3));
    }
}
