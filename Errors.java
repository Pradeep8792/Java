public class Errors {

    static int add() //instead of int retrun string
    {
        //return "Hello"; //Wrong return type 
        //Fix 1 
        return 100;
    }
    public static void main(String[] args) {
        //Syntax error 
        System.out.println("Hello");
         
        //Semantic error -->>Logical error ->complied and run 
        //output is not same as expected output 
        // Whos Given -->JVM
        int a=5;
        int b=20;

        int area = 2*(a+b); // logic
        System.out.println(area);

        //Wrong return type

        System.out.println(add());


        //Duplicate varibale 
        int age =25;
        //int age=35;///Error dupliacte local variable 

        //fix 1 change variable name 
        int Age =30;

        System.out.println(age);
        System.out.println(Age);

        //Fix 2 update
        int age1=20;
        age1=30;
        System.out.println(age1);

        //Type missmatch 
        int x=100;
        //byte y=x;//Type mismatch: cannot convert from int to byte

        int b1= x;
        System.out.println(b1);


    


    }
}
