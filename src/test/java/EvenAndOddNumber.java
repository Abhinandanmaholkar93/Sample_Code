import java.util.Scanner;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scr.nextInt();

        if (number%2==0)
        {
            System.out.println(number+" is even");
        }else {
            System.out.println(number+" is odd");
        }

    }
}
