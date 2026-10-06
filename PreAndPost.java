public class PreAndPost {
    public static void main(String[] args) {
       /*  int a = 10;
        int b=11;
        int c = a++ + ++b;
        System.out.println(c);*/

        //================Section 1 ================
        System.out.println("Section 1: Post and pre increament ");
        int a =10;

        System.out.println(a++);//10 No 10 and 11
        System.out.println(a);//11

        System.out.println(a++);//11
        System.out.println(a);//12

        System.out.println(++a);//13
        System.out.println(a);//13

        System.out.println(a++);//13
        System.out.println(a);//14


        System.out.println("Section 2 : post decreament and pre decrement ");
        
        int b = 14;

        System.out.println(b--);//14
        System.out.println(b);//13

        System.out.println(--b);//12
        System.out.println(b);//12

        System.out.println(b--);//11
        System.out.println(b);//11

        System.out.println(b--);//11
        System.out.println(b);//10

        System.out.println("Section 3 Assignment with Post increament");
        int c = 10;
        int d= c++;
        
        System.out.println(d);//10
        System.out.println(c);//11
        System.out.println();

        System.out.println("Section 4 :Assignment with pre increament");

        int e = 10;
        int f = ++e;
        System.out.println(e);
        System.out.println(f);
        System.out.println();


        // home -- take input assign with decreament (pre and post )
        System.out.println("Section 5 simple expression");
        int g = 10;
        
        System.out.println(g++ + 5);//15
        System.out.println(g);//11


        System.out.println(++g + 5);//17
        System.out.println(g);//12

        System.out.println("============Section 6=================");
        System.out.println("COmplex expression");

        int h =10;
        System.out.println(h++ + ++h);//
        System.out.println(h++ - ++h);//
        System.out.println(++h - ++h);//
        System.out.println(++h - h++);//
        System.out.println(h);//
        System.out.println(++h - (--h));//
        System.out.println(h);//



        System.out.println("Section  - 7 :Character increament ");

        char ch = 'A';

        System.out.println(ch++);
        System.out.println(ch);

        System.out.println(++c);

        System.out.println("Assinment on boolean:connt be compled");
          /*boolean flag=true;
          flag++;
          ++flag;
          flag--;
          --flag */

        System.out.println("Assinment on fixed values:connt be compled");
        /*100++;
        ++100
        --100
        100-- */

        System.out.println("Section 8 MIxed Expresion");
        int n1 = 10;
        int n2 =20;
        System.out.println(n1++ + --n2);
        System.out.println(--n1 - n2++);
        System.out.println(n1++ + n2--);

        System.out.println("Section  - 9 :Character Decrement ");

        char ch1 = 'A';

        System.out.println(ch1++);
        System.out.println(ch1);

        System.out.println(++ch1);




    }
}
