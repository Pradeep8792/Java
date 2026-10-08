public class Loops {
    public static void main(String[] args) {

        System.out.println("=======For loop==========");
        for( int i =1;i<=5;i++)
            {
                System.out.println(i);
            }

        System.out.println("=======While loop==========");
            int j=0;
            while (j<=10) {
                
                System.out.println(j);
                j++;
            }
            
        System.out.println("=======DO while loop==========");
            int i=0;
            do{
                System.out.println("Algo");
                i++;
            }
            while(i<5);
             
            int numbe[]={10,20,30,40};
            for (int k : numbe) {
                System.out.println(k);
                
            }
        }
}
