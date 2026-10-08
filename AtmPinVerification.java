public class AtmPinVerification {
    public static void main(String[] args) {
        int pin = 1234;
        boolean insert= true;

        
        if(insert)
        {
            if(pin == 1234)
            {
                System.out.println("Verified ");
            }
            else{
                System.out.println("Not verify");
            }
        }
        else{
            System.out.println("Insert the card");
        }
    }
}
