import java.util.*;

public class Swicth{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess any Number(1-5) to win Reward :");
        int guess=sc.nextInt();
        switch(guess){
            case 1:
                System.out.println("Mango");
                break;
            case 2:
                System.out.println("Grapes");
                break;
            case 3:
                System.out.println("Orange");
                break;
            case 4:
                System.out.println("Kiwi");
                break;
            case 5:
                System.out.println("Pineapple");
                break;
            default:
                System.out.println("Please Insert value between 1-5");
        }
        
    }
}