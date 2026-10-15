public class VarArgs
{
    public static void show(int ...x)
    {
        for (int i : x) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("======");
        for( int i =0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
        System.out.println();

        
    }
    public static void main(String args[])
    {
        show(10);
        show(10,20);
        show(10,20,30);
    }
}