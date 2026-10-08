public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("============Nested For loop ============");
        for(int i=1;i<=3;i++)
            {
                for(int j=1;j<=3;j++)
                    {
                        System.out.println(i+" :Run "+j);
                    }
                    System.err.println("=========");
            }
            System.out.println("============Nested While loop ============");

            int i=0;
            while (i<=5) {
                int j=1;
                while (j<=3) {
                    System.out.println(i+" Run "+j);
                    j++;
                }
                System.out.println("==========");
                i++;
            }
    }
}
