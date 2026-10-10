import java.nio.channels.Pipe.SourceChannel;
import  java.util.*;;
public class ProblemsOnLoop {
    public static void main(String[] args) {
        
       // Scanner obj = new Scanner(System.in);
        
        /*System.out.println("Enter a number");

        int num = obj.nextInt();
        int sum = 0; // empty hand
        for( int i =0;i<=num;i++)
        {
           sum=sum+i;

        }
        System.out.println("Sum : "+sum);
        obj.close();*/

        /*System.out.println("Enter the number");
        int num = obj.nextInt();
        int fact =1;
        for ( int  i= 1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
*/

        //  for ( int i = 1;i<=3;i++)
        //  {
        //     for(int j= 1;j<=3;j++)
        //     {
        //         System.out.print("("+i+","+j+")"+"\t");
        //     }   
        //     System.out.println();
        //  }


        for( int i = 1 ;i<=10;i++)
        {
            for( int j = 2 ;j<=10;j++)
            {
                System.out.print(j*i+"\t");
            }
           System.out.println();
        }
    }
}
