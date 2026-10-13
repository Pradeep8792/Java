import java.util.*;
// static +bool
public class EvenOdd2 {

    public static boolean evenOdd(int number)
    {
        if(number % 2 ==0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        boolean res = evenOdd(number);
        if(res)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
