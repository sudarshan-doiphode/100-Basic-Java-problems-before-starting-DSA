public class Main{

    private static int greatestNumber(int first, int second){
        if(first>second)
        return first;
        else
        return second;
    }

    public static void main(String[] args) {
        System.out.println("Greatest Number is:" + greatestNumber(5, 2));
    }
}