public class ReverseString {
    public static void main(String[] args) {
        String name="Abhinandan";char rev;
        System.out.println(name.length());
        for (int i=name.length()-1;i>=0;i--)
        {
            rev=name.charAt(i);
            System.out.print(rev);
        }
        System.out.println();

//        StringBuilder name=new StringBuilder("Abhinandan");
//        System.out.println(name.reverse());

//        StringBuffer name=new StringBuffer("Abhinandan");
//        System.out.println(name.reverse());
    }
}
