public class MergingAndMasking {
    public static void main(String[] args) {
        
        //merging
        System.out.println("Merging");

        int first = 5; //00000101
        int second = 10; //00001010

        int result = (first << 4 | second);
        System.out.println(result);

        int number = 90;

        int res  = number & 15; //00001111
        System.out.println(res);

    }
}
