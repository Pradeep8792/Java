public class VarArgs1 {
    public static void student(String name, int age , int ...marks )
    {
        System.out.println(name);

        System.out.println(age);
        System.out.println();
        for(int mark : marks) 
        {
            System.out.print(mark+" ");
        }
       
    }
    public static void main(String args[])
    {
        student("Rohit",21,70,80,90);
        student("Amit",22,65,85);
    }
}
