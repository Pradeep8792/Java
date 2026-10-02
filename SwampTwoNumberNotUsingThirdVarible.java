public class SwampTwoNumberNotUsingThirdVarible {
    public static void main(String[] args) {
        int a=10;
        int b=20;
         
        System.err.println("============Before swappin==========");
        System.out.println(a);
        System.out.println(b);

        System.out.println("==============After swapping===========");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
