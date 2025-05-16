import java.util.*;
public class ifElseLadder{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible for Voteing!");
        }
        else if(age >= 12 && age < 18){
            System.out.println("You can Apply for VoterList");
        }
        else{
            System.out.println("You are not Eligible For Voteing");
        }
    }
}