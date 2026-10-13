public class MethodsCallingMethods {
    public static void greet()
    {
        System.out.println("Helo");
    }
    public static void welcome()
    {
        System.out.println("Welcome");
        greet();
        System.err.println("Welcome methods end ");
    }
    public static  void main(String args[])
    {
        System.out.println("Main starts");
        welcome();
        System.out.println("Main methods end");
    }
}
