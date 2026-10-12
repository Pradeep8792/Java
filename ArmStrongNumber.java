

public class ArmStrongNumber {
    public static  void main(String args[])
    {
        int num=153;
        int rev;
        int sum =0;
        int temp=num;
        while (num!=0) {
            
            int rem = num %10;
            // sum = sum+(rem*rem*rem);
            sum=(sum*10)+rem;
            num = num /10;

        }
        if(temp == sum)
        {
            System.out.println("Given number is arm strong ");
        }else
        {

            System.out.println("Given number is not  arm strong ");
        }
       System.out.println("Rev :"+sum);
    }
}
