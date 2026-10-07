import  java.util.*;
public class ifAndIfElse {
    public static void main(String[] args) {
        
        int age = 20;
        Scanner obj =new Scanner(System.in);
        age=obj.nextInt();
        System.out.println("Only of if ");
        if(age >= 18)
        {
            System.out.println("Shotlisted");
        }
        else{
            System.out.println("Not shotlisted");
        }
    }
}
