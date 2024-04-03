public class PalindromeNumber {
    public static void main(String[] args) {
       int number=121; int temp=number; int rev=0; int remain=0;

       while (temp!=0)
       {
           remain=temp%10;
           rev=rev*10+remain;
           temp=temp/10;
       }
       if (rev==number)
       {
           System.out.println("palindrome number");
       }else {
           System.out.println("not a palindrome number");
       }
    }
}
