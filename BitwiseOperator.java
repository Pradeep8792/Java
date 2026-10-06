public class BitwiseOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 6;

        System.out.println("AND  : "+(x & y));
        System.out.println("OR  : "+(x | y));
        System.out.println("XOR  : "+(x ^ y));
        System.out.println();
        System.out.println(~x);
        System.out.println(~y);
        System.out.println();

        //Shifting
        System.out.println("Shifting");
        System.out.println("Left shift by 1 "+ (x << 1));
        System.out.println("Left shift by 2 "+ (x << 2));
        System.out.println("Right shift by 1 "+ (x >> 1));
        System.out.println("Right shift by 2 "+ (x >> 2));
        System.out.println();

        //Unsigned Right shift
        System.out.println("Unsigned RIghtShift");
        
        int z = -10;

        System.out.println("Signed right shift by 1"+(z >> 1));
        System.out.println("UnSigned right shift by 1"+(z >>> 1));


    }
}
