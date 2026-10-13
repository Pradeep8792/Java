import java.util.*;
public class EvenOrOdd1 {
    
    public static int evenOrOdd(int num)
    {
        if(num % 2 ==0)
        {
            return 1;

        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();

        int res = evenOrOdd(number);
        if( res == 1)
        {
            System.out.println("Even");
        }
        else
        {

                System.out.println("odd");
        }
    }
}
