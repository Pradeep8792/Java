public class IfElseIfLadder {
    public static void main(String[] args) {
        
        int marks =95;
        
        if(marks>=90)
        {
            System.out.println("Officer");
        }
        else if (marks>= 80)
        {
            System.out.println("Technical team");
        }
        else if (marks>=70)
        {
            System.out.println("General Duty");
        }
        else if(marks>=60)
        {
            System.out.println("Clerk");
        }
        else{
            System.out.println("Not qualified");
        }
    }
}
