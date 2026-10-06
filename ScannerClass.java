import java.util.*;
public class ScannerClass {
    public static  void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);// sc  -- []
        int a ,b,c;// place create a madbeku to store the values
        System.out.println("Enter the First number ");
        a = sc.nextInt();// 25 integer
        
        System.out.println("Enter the Second  number ");
        b = sc.nextInt();// 25 integer

        c = a+b;
        System.out.println("Sum of "+a+" and "+ b+" is "+c);

        sc.close();

    }
}
