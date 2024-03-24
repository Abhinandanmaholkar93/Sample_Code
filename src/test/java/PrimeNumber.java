import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scr.nextInt();
        int temp=0;
        for (int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                temp=temp+1;
            }
        }
        if (temp==0)
        {
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is not a prime number");
        }
    }
}
