public class BitwiseDivisibility {
    public static void main(String[] args) {
        
        int num = 40;
        int divisor = 8;

        if((num & (divisor-1))==0) // 0000 0111
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not divisible");
        }

    }
}
