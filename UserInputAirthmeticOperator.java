import java.util.*;
public class UserInputAirthmeticOperator
{
    public static void main(String []args)
    {
        int a,b;
        Scanner obj =new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);       
    }
}