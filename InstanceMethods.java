public class InstanceMethods {

    public   void  greet() // no arguments and no return type 
    {
        System.out.println("Hello");
    }
    public  void sum(int a,int b)// no arguemnts its printing
    {
        
        System.out.println(a+b);
    }
    public  int getnumber() // no arguments but retruns
    {
        return 100;

    }
    public  int maxOfTwoNumber(int x, int y )// with return type and with arguments 
    {
        if(x>y)
        {
           return x;

        }
        else
        {
            return y ;
        }
    }
    public static void main(String[] args) {

        //single object for all the methods

        InstanceMethods obj =new InstanceMethods();
        obj.greet();


          obj.greet();
        obj.sum(10,20);
        System.out.println(obj.getnumber());
        System.out.println(obj.maxOfTwoNumber(10, 20));  


        InstanceMethods obj1 = new InstanceMethods();
        obj1.greet();

        InstanceMethods obj2 = new InstanceMethods();
        obj2.sum(20,30);

        InstanceMethods obj3 = new InstanceMethods();
        obj3.sum(5, 3);
        
        InstanceMethods obj4 = new InstanceMethods();
        obj4.maxOfTwoNumber(25, 30);
        


        
    }
}

