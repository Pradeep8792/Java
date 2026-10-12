//Static methods

public class Methods {

    public  static void  greet() // no arguments and no return type 
    {
        System.out.println("Hello");
    }
    public static void sum(int a,int b)// no arguemnts its printing
    {
        
        System.out.println(a+b);
    }
    public static int getnumber() // no arguments but retruns
    {
        return 100;

    }
    public static int maxOfTwoNumber(int x, int y )// with return type and with arguments 
    {
        if(x>y)
        {
           return x;

        }
        else
        {
            return y ;
        }
    }

    public static void main(String[] args) {

        greet();
        sum(10,20);
        System.out.println(getnumber());
        System.out.println(maxOfTwoNumber(10, 20));   
    }
}