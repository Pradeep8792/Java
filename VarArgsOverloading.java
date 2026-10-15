public class VarArgsOverloading {
    static void show( int ...x){
        System.out.println("Int type");
    }
    static void show( double ...x){
        System.out.println("Double type");
    }
    public static void main(String args[])
    {
        show(10);
        show(10.5,15.5);
    }
}
