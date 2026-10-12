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

    public static void main(String[] args) {
        show();
        show(0);
        show(10, 20);
    }
}
