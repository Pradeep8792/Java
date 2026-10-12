import java.util.*;;
public class SumOfEvenNumers {
    public static void main(String [] args)
    {
        int n,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number ");
        n=obj.nextInt();

        for(int i=0;i<=n;i++)
        {
            if((i % 2) ==0)
            {
               sum = sum+i;   
            }
        }
        System.out.println("Even sum is "+sum);
    }
}
