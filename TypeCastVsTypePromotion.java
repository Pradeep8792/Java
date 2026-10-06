public class TypeCastVsTypePromotion {
    public static void main(String[] args)
    {
        //Error cannot put int in byte 
        /*int a = 10 ;
        byte b = a;
        System.out.println(b);//Error*/

        //int store in int 
        int i = 11;
        int j = i;
        System.out.println(j); // -- No error 

        //type cast -- date loss or not 
        int x = 10;
        byte y = (byte)x;
        System.out.println(y);//no error and no data loss

        //type caste and there is data loss
        int c=200;
        byte d=(byte)c;
        System.out.println(d);

        //how long is stored in float 
        long l1 = 123456789012346789L;
        float f=l1;

        System.out.println(l1);
        System.out.println(f);

        double n=l1;
        System.out.println(n);//More precise output



    }
}
