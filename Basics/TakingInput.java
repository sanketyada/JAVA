import java.util.*;
public class TakingInput{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter Any Integer");
        a=sc.nextInt();
        if(a % 2 ==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        
    }
}