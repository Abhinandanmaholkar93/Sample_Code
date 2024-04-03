import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scr=new Scanner(System.in);
        int number=scr.nextInt(); int count=0; int t1=number;

        while (t1!=0)
        {
            count=count+1;
            t1=t1/10;
        }
        System.out.println(count);
        int t2=number; int rem; int arm=0;
        while (t2!=0)
        {
            rem=t2%10; int multi=1;
            for (int i=1;i<=count;i++)
            {
                multi=multi*rem;
            }
            arm=arm+multi;
            t2=t2/10;
        }if (arm==number){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }
}}
