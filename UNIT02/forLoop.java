import java.util.*;
public class forLoop{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Number for Sum");
        int newValue=0;
        for(int i=0; i<5 ;i++){
            int value= sc.nextInt();
            newValue= value+newValue;
        }
        System.out.println(newValue);
    }

}