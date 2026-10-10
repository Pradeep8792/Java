public class LoopsExample {

    public static void main(String[] args)
    {
        System.out.println("=========");
        for( int i= 1;i<=64;i=i*2)
        {
            System.out.println(i);
        }

        //Half
        System.out.println("Half");
        for ( int i =64 ;i>=1;i=i/2)
        {
            System.out.println(i);
        }
    }
}