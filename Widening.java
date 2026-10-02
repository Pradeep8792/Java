public class Widening {
    public static void main(String[] args) {
        byte b =10;
        int i = b;//any loss -- no loss

        long l = i;//int --> long  -- no loss
        float f = l; //int -- float -- no loss

        double d = f; // double -- float 

        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        
    }
}
