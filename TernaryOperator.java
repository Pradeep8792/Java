public class TernaryOperator {
    public static void main(String args[])
    {
        int a=10;
        int  b= 20;
        int c =30;
        int largest = (a  > b & a> c)?a:
                        (b>c )?b:c;
        
        System.out.println(largest);
        
        int n1 =-1;
        System.out.println((n1>0)?"Negative":"Positive");
    } 
}
