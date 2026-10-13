//Different argements
public class MethodOverloading {
    
    public static void show()
    {
        System.out.println("HI ");
    }
    public static void  show(int a)
    {
        System.out.println("Recieve one integer");     
    }
    public static void show(int a, int b )

    {
        System.out.println("Recieve two parameters");
    }


    // different data types
    public static void display (int a)
    {
        System.out.println("Int ");
    }
    public static void display (double a)
    {
        System.out.println("Double ");
    }
    public static void display (float a)
    {
        System.out.println("float ");
    }
    public static void display (char a)
    {
        System.out.println("char ");
    }
    public static void display (String a)
    {
        System.out.println("String ");
    }
    
    // Different order of parameters
    public static void print (int a , double b)
    {
        System.out.println("int , double");
    }
    public static void print (double b , int i )
    {
        System.out.println("Double ,int ");
    }
    

    //Mix 
    public  static void add()
    {
        System.out.println(10+5);
    }
    public  static void add(int a)
    {
        System.out.println(5+a);
    }
    public static void add(int a ,int b)

    {
        System.out.println(a+b);
    }

    public static void type(int a)
    {
        System.out.println("int");
    }
    public static void type(double a)
    {
        System.out.println("double");
    }



    // Exact matching 
    public static void exact(int a)
    {
        System.out.println("int");
    }
    
    public static void exact(long a)
    {
        System.out.println("long");
    }

    // Return type change 
    public static  int add1(int a ,int b )
    {
        return a+b;
    }
    /*public static  double add1(int a ,int b )
    {
        return a+b;
    }*/

    //character promotion
    public static void show1(char a)
    {
        System.out.println("char");
    }

    //parameter name dont matter
    public static void display1(int x)
    {
        System.out.println();
    }

    // error parameter doesnot matter
    // public static void display1(int y )
    // {

    // }

    // Ambiguity
    public static void show2()
    {
        System.out.println("Float");
    }
    public static void show2(double a )
    {
        System.out.println("Double");
    }
    public static void main(String[] args) {
        show(); //no args
        show(0);//single args
        show(10, 20);// two ags
        // show(10,20,30) // Error

        display(null);
        display(0);
        display(null);
        display(0);
        display(0);

        print(0.0, 0);
        print(0, 0.0);

        add();
        add(5);
        add(10,20);

        byte b =5;
        float f= 10.4f;
        short s = 20;
        type(f);
        type(b);
        type(s);


        int x=10;
        long y =20;

        exact(y);
        exact(x);

        int result = add1(10, 20);
        System.out.println(result);

        char ch = 'A';
        show1(ch);

        
    }
}
