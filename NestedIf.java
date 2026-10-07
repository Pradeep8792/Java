 import  java.util.*;
public class NestedIf {
    public static void main(String[] args) {
        
        Scanner obj =new Scanner(System.in); 
        int age = 20;
        int height =175;
        boolean medicalFit = true;
        boolean physcial = true;

        if(age>=18)
        {
            if(height >=175)
            {
                if(medicalFit)
                {
                    if(physcial)
                    {
                        System.out.println("Selected ");
                    }
                }
            }
        }
    }
}
