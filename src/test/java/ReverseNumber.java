public class ReverseNumber {
    public static void main(String[] args) {
        int number=7654321; int rev=0; int remain=0; int temp=number;
        while (temp!=0)
        {
            remain=temp%10;
            rev=rev*10+remain;
            temp=temp/10;

        }
        System.out.println(number+" rev number is "+rev);

}}
