import java.util.*;
//Instance + void
public class EvenOddInstance {

    public void evenodd(int number)
    {
        if(number % 2 ==0)
        {
            System.out.println("EVen");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[])
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        EvenOddInstance obj = new EvenOddInstance();
        obj.evenodd(number);
        
    }
}
