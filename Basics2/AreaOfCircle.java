import java.util.*;
public class AreaOfCircle{
    public static void main(String arg[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius Of Circle\n");
        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println("The area of circle is "+area+" Sqft");
    }
}