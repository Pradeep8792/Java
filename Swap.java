public class Swap {
    public static  void main (String []args)
    {
        int a = 5;
        int b = 15;
        int temp;

        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        System.out.println("After Swapping");

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }
}
