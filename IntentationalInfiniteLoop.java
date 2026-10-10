public class IntentationalInfiniteLoop {
    public static void main(String[] args) {
        
        /*for ( ;;)// takes input as true and runs infinite times
        {
            System.out.println("Algo");
        }*/

        //Print  mulitple of 5
        for( int i = 5; i<=25;i=i+5)
        {
            System.out.println(i);
        }

        int i =5;
        while (i<=25) {
            System.out.println(i);
            i+=5;
        }
        // using do while
        System.out.println("===========");
        int j =5;
        do{
            System.out.println(j);
            j=j+5;
        }
        while(j<=25);

        //Print odd numbers

        for( int k = 1;k<=9;k=k+2)
        {
            System.out.println(k);
        }

        //USing while
        System.out.println("Using while");
        int l =1;
        while (l<=9) {
            System.out.println(l);
            l=l+2;

            
        }

        // Using  do while 
        System.out.println("Do while");
         int n1 = 1;
         do{
            System.out.println(n1);
            n1=n1+2;
         }
         while(n1<=9);

         System.out.println("Print number decending order (10-1)");
         for( int m = 10;m>=1;m--)
         {
            System.out.println(m);
         }

        System.err.println("Even numbers in decending order");
        for ( int num = 10;num>=0;num=num-2)
        {
            System.out.println(num);

        }
        System.out.println();

        System.out.println("Square root ");
        for( int num1 = 1; num1<=20;num1=num1+1)
        {
            System.out.println(num1+""+num1*num1);
        }

        System.out.println("While loop");
        int num3 = 1;
        while (num3<=20) {
            System.out.println(num3*num3);
            num3++;
        }

        
    } 
}
