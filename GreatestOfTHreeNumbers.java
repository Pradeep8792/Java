import java.util.*;
public class GreatestOfTHreeNumbers {
    public static void main (String [] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number 1 ");
        int n1 = obj.nextInt();
        System.out.println("Enter the number 2 ");
        int n2 = obj.nextInt();
        System.out.println("Enter the number 3 ");
        int n3 = obj.nextInt();

        if(n1 > n2 && n1 > n3)
        {
            System.out.println(n1+" is greater");
        }else if( n2 > n3 )
        {
            System.out.println(n2+" is greater");
        }else{
            System.out.println(n3+" is greater");
        }
    
    }  
}
