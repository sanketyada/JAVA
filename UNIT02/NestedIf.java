import java.util.*;
public class NestedIf{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a > b){
            if(a >c){
                System.out.println(a+" is Greater Number");
            }
        }
        else if(b >c){
            System.out.println(b+" is Greater Number");
        }
        else{
            System.out.println(c+" is Greater Number");
        }
        
    }
}