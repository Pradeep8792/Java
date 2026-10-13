import java.util.*;
// boolean + instance
public class BoolEvenOddInstance {

    public boolean evenOdd(int number)
    {
        if(number % 2==0)
        {
            return true;

        }
        else{
            return  false;
        }
    }
    
    public static void mian(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        BoolEvenOddInstance obj= new BoolEvenOddInstance();
        boolean res  = obj.evenOdd(num);
        if(res)
        {
            System.out.println("Even");
        }
        else
        {

            System.out.println("odd");
        }

    }
}
