import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scr.nextInt();
        int t1=number;
        int count=0;

        while (t1!=0)
        {
            count=count+1;
            t1=t1/10;
        }
    }
}
