public class LogicalOprator{
    public static void main(String arg[]){
        int a=12;
        int b=20;
        int c=30;
        if(c>b  && c>a){
            System.out.println("C is Greater Number");
        }
        if(b>a || b>c){
            System.out.println("May be B is Greater Number");
        }
        if(!(b<a)){
            System.out.println("B is greater than A");
        }
    }
}