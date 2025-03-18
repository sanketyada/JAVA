public class TypePromotion{
    public static void main(String arg[]){
        int a=10;
        long b=20;
        float c=20.33f;
        double d=12.33;

        // int ans=a+b+c+d;   possible lossy conversion from double to int
        double ans=a+b+c+d; 
        System.out.println(ans);
    }
}