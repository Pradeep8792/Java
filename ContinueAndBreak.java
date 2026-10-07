public class ContinueAndBreak {
    public static void main(String[] args) {
        System.out.println("================Break==============");
        for (int i=0;i<=10;i++)
        {
            if(i==6)
            {
                break;//terminite the 
            }
            System.out.println(i);
        }
        System.err.println("=========Loop  terminited=============");

         System.out.println("=================Continue=============");
        for(int i=0;i<=10;i++)
        {
            if(i==6)
            {
                continue;//skip
            }
            System.out.println(i);
        }
    }
}
