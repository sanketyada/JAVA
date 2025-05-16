import java.util.*;
public class ternaryOperator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Year of Dob");
        int Dob=sc.nextInt();
        String result = (Dob >= 2000) ? "Gen Z" : "Millennial";
        System.out.println(result); 

    }
}