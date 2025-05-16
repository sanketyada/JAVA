// Method //
//Built in Method

// import java.lang.Math;
// public class Method{
//     public static void main(String arg[]){
//         System.out.println(Math.sqrt(9));
//     }
// }

//user Defined Method


public class Method{
    public static int  greet(int a,int b){
        // System.out.println(a+b);
        return (a+b);
    }
    public static void Welcome(){
        for(int i=0 ; i<=5 ; i++){
            System.out.println("Welcome"+i);
        }
    }

    public static void main(String arg[]){

        //with return Type
        int add=greet(10,20);
        System.out.println(add);

        //without Return Type
        Welcome();

    }
}


