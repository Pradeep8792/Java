import java.util.*;
public class EvenOrOdd {
    


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number :");
        int number = sc.nextInt();

        evenOROdd(number);

    }

    public static void evenOROdd(int num)
    {
        if(num % 2 ==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
