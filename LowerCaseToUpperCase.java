public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        String st = "Hello";
        

        for(int i=0;i<st.length();i++)
        {
           char  c = st.charAt(i);
            if(c>='a'& c<='z')
            {
                c=(char)(c-32);
            }
            
            System.out.print(c);
        }
        
    }
}
