//How JVM behave with static ,instance and local variable
public class DifferenceBwStatic
{
    static int b=5 ;
    int c; //without static keywoard 

    public static void main (String[]args)
    {
        // It it mandatory that assign  value inside method
       // int a;
        ///System.out.println(a);
        
        //static demo
        System.out.println(b);

        //instance
        DifferenceBwStatic obj = new DifferenceBwStatic();
        System.out.println(obj.c);

        System.out.println(DifferenceBwStatic.b);


    }
}