import  java.util.*;
public class CombinedCondition {
    public static void main(String[] args) {
        
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = obj.nextInt();

        System.out.println("Enetr the height");
        float height = obj.nextFloat();

        System.out.println("Percentage");
        double per = obj.nextDouble();

        System.out.println("Are you a medical fit");
        boolean medicalFit = obj.nextBoolean();

        System.out.println("==================AND(&&)================");
        System.out.println("All condition must  be true ");
        if( age >=18 && height >= 170 && medicalFit)
        {
            System.out.println("Selected to army ");
        }
        else{
            System.out.println("Not selected for army ");
        }

        System.out.println("==================OR(||)==============");
        System.out.println("-->At least one m=condtion must be true--");

        if(per >=90 || medicalFit)
        {
            System.out.println("Special consideration");
        }
        else{
            System.out.println("No speical consideration");
        }

        System.out.println();

        //reverse boolean
        if(!medicalFit)
        {
            System.out.println("Medical test failed ");
        }
        else{
            System.out.println("Medical test passed ");
        }

        System.out.println();
        //Combined all operators
        System.out.println("===========Combined all operators============");

        if((age >= 18 &&height >= 170 ) && (per >=60 || medicalFit))
        {
            System.out.println("Final selection eligible ");
        }
        else{
            System.out.println("Rejected");
        }
        obj.close();
    }
}
