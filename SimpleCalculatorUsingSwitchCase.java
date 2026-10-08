import java.util.*;
public class SimpleCalculatorUsingSwitchCase {
    public static void main(String args[]) 
    {
        Scanner obj = new Scanner(System.in);
        
       
        System.out.println("Enter 1 : Addition \n 2: Subtraction \n 3: Multilipication \n 4 :Division \n 5 : modulus ");
        int number = obj.nextInt();
         switch (number) {
            case 1:
                System.out.println("Enter the number 1:");
                int n1 = obj.nextInt();
                System.out.println("Enter the number 2:");
                int n2 = obj.nextInt();
                System.out.println("Sum of "+n1+" and "+n2+" is "+(n1+n2));
                break;

                
            case 2:
                System.out.println("Enter the number 1:");
                int n3 = obj.nextInt();
                System.out.println("Enter the number 2:");
                int n4 = obj.nextInt();
                System.out.println("Sum of "+n3+" and "+n4+" is "+(n3-n4));
                break;
                
            case 3:
                System.out.println("Enter the number 1:");
                int n5 = obj.nextInt();
                System.out.println("Enter the number 2:");
                int n6 = obj.nextInt();
                System.out.println("Sum of "+n5+" and "+n6+" is "+(n5*n6));
                break;
                
            case 4  :
                System.out.println("Enter the number 1:");
                int n7 = obj.nextInt();
                System.out.println("Enter the number 2:");
                int n8 = obj.nextInt();
                System.out.println("Sum of "+n7+" and "+n8+" is "+(n7/n8));
                break ;
                
            case 5  :
                System.out.println("Enter the number 1:");
                int n9 = obj.nextInt();
                System.out.println("Enter the number 2:");
                int n10 = obj.nextInt();
                System.out.println("Sum of "+n9+" and "+n10+" is "+(n9%n10));
                
                break;
        
            default:
                System.out.println("Invalid Enter only (1 to 5)");
                break;
        }
        
        
    }
    
    
}
