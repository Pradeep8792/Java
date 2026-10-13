import java.util.*;

public class EvenOrOddInstance {
    public int evenodd1(int num)
    {
        if(num %2 ==0)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int num= sc.nextInt();
        EvenOrOddInstance obj = new EvenOrOddInstance();
        int res = obj.evenodd1(num);
        if(res==1)
        {
            System.out.println("Even");
        }
        else
        {
                
                System.out.println("odd");
        }

    }
}
