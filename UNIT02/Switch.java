import java.util.*;
public class Switch{
    public static void main(String arg[]){
        System.out.println("Guess Your SuperHeros by Slecting 1-5");
        Scanner sc = new Scanner(System.in);
        int guess=sc.nextInt();
        switch(guess){
            case 1:
                System.out.println("SpiderMan");
                break;
            case 2:
                System.out.println("IronMan");
                break;
            case 3:
                System.out.println("BatMan");
                break;
            case 4:
                System.out.println("Hulk");
                break;
            case 5:
                System.out.println("Shaktiman");
                break;
            default:
                System.out.println("Guess Number Between (1-5) only");
        }
    }
}