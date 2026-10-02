public class IntDivVSFloatDiv {
     public static void main(String[] args) {
        int a=10;
        int b=20;
        
        System.out.println("integer DIv"+(a/b));

        float f1 = 2.5f;
        float f2 = 2.5f;

        System.out.println("Float div"+ (f1/f2));

        double d1 = 7;
        double d2 =2;

        System.out.println("Double div"+(d1/d2));

        //type cast and divide
        System.err.println("float div int :"+((float)(a)/b));
        System.err.println("float div int :"+((a/(float)b)));
        System.err.println("float div int :"+((double)(a)/b));
        ///System.err.println("float div int :"+(a/(double)));


     }
}
