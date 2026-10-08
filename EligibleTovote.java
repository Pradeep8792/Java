import java.util.*;
public class EligibleTovote {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

            System.out.println("Enter the nationality");
            String nationality = obj.nextLine();

            
            if(nationality == "Indian" || nationality=="INDIAN" )
            {
                System.out.println("Enter the age ");
                int age = obj.nextInt();
                if(age>=18)
                {
                    System.out.println("Eligible to vote ");
                }
                else{
                    System.out.println("Not eligible to vote");
                }
            }
            else
            {
                System.out.println("You are not a indian citizen");
            }
    }
}
