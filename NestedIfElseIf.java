import java.util.*;
public class NestedIfElseIf {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the age ");

        int age =obj.nextInt();// String to int 

        System.out.println("Enter Percentage");
         
        int percentage = obj.nextInt();

        if(age >= 18)
        {
            if(percentage >= 90)
            {
                System.out.println("Officer");
            }
            else if( percentage >= 75)
            {
                System.out.println("Techinical");
            }
            else if (percentage >= 60)
            {
                System.out.println("GD");
            }
            else {
                System.out.println("Not qualified");
            }
        }
        else{
            System.out.println("Age not eligible");
        }
        obj.close();
    }
}
