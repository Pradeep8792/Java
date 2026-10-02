public class TypeCasting {
    public static void main(String[] args)
    {
        double d = 123.75;

        int i = (int)(d); //Type casting /Explicite type conversion 

        short s = (short)(d);
        
        byte  b = (byte)(d);

        System.out.println(d);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);

        int i1 = 130;
        byte b1 = (byte)(i1);
        System.out.println(b1);
    }
}
