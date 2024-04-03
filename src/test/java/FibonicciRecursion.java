public class FibonicciRecursion {
    static int a=0; static int b=1; static int c;
    public static void main(String[] args) {
        System.out.print(a+"  "+b);
        FibonicciRecursion fr=new FibonicciRecursion();
        fr.printFibo(10);
    }
    void printFibo(int i)
    {
        if (i>0)
        {   c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
        printFibo(i-1);

    }}
}
