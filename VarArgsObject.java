//Pass different data types together using objects
public class VarArgsObject {
    public static void show(Object ...obj)
    {
        for(Object i : obj)
        {
            System.out.println(i);
        }
        System.out.println();
    }
    public static void main(String args [])
    {
        show(101,"Rahul",true,92.5,'A');
    }
}
