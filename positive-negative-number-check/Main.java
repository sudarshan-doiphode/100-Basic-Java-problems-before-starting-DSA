import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number here :");
        int number = s.nextInt();
        if(number>=0)
        System.out.println("Positive");
        else
        System.out.println("Negative");
    }
}