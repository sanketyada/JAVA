import java.util.*;
public class Add2Numbers{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("The Sum of Two Number is "+sum);
    }
}