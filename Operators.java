public class Operators {
    public static void main(String[] args) {
        
        //IN java relational operators return true or false only (Boolean)
        System.out.println("Relational Operators :Comparsion");
        int a =20;
        int b =10;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("Logical operators");
        boolean x = true ;
        boolean y = false ;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        //Compound operators  -- java does automated type casting for this operator
        System.out.println("Compount operators");
        int h = 10;
        h += 5;
        System.out.println(h);

        h -= 3;
        System.out.println(h);

        h *=2;
        System.out.println(h);

        h /=6;
        System.out.println(h);

        h %=3;
        System.out.println(h);


        //Ternory operator
        System.out.println("Ternory operator");
        int i = 30;
        int j = 40;

        //syantax -->datatype variable_name  = (condtion check) ? true :false
        int max = (i > j) ? i :j;
        System.out.println(max);


    }
}
