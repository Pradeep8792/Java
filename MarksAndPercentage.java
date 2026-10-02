public class MarksAndPercentage {
    public static void main(String[] args) {
        int m1=50;
        int m2=25;
        int m3=60;
        int m4=85;
        int m5=90;
        int m6=75;
        
        int sum = m1+m2+m3+m4+m5+m6;
        int avg = sum/6;
        float pecentage = ((sum /600f)*100);
        System.out.println(avg);
        System.out.println(pecentage);
    }
}
