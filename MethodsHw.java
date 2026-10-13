public class MethodsHw {
    
    public String evenOROdd(int num)
    { 
        
       if(num % 2==0)
       {
            return "Even";
       }
       else{
             return "Odd";
       }         
    }

    public static void digitsCount(int num)
    {
        int count=0;
        while(num !=0)
        {
            num=num/10;
            count++;   
        }
        System.out.println("Number of digits is "+count);  
    }
    public int  maxOfThreeNumbers(int a , int b ,int c)
    {
        int max =(a>b & a>c)?a:(b>c)?b:c;
        return  max;
    }
    public int palindrome(int num )
    {   
        int temp=num;
        int rev=0, rem=0;
        while (num !=0) {
            rem = num %10;
            rev = rev*10+rem;
            num = num/10; 
        }
        if(rev==temp)
        {
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args)
    {
        MethodsHw obj = new MethodsHw();
        
        System.out.println(obj.evenOROdd(2));

        obj.digitsCount(123);

        System.out.println(obj.maxOfThreeNumbers(15, 20, 555));
        
        if((obj.palindrome(121))==0)
        {
            System.out.println("GIven number is a palindrome");
        }
        else
        {
            System.out.println("GIven number is not  palindrome");
        }
    }

}
