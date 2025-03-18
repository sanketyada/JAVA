          //Local Variable//
// public class Basic02{
//     public void get(){
//         int a=10;
//         System.out.println(a);
//     }
//     public void show(){
//         System.out.println(a);
//         // a cannot be accesd here
//     }
//     public static void main(String arg[]){
//        Basic02 obj = new Basic02();
//        obj.get();
//        obj.show();
//     }
// }


//                Instance Variable            //

// public class Basic02{
//     int a=20;
//     public void get(){
//         System.out.println("get "+a);
//         //a accessble here
//     }
//     public void show(){
//         System.out.println("Show "+a);
//         //a accessble here
//     }
//     public static void main(String arg[]){
//         Basic02 obj=new Basic02();
//         obj.get();
//         obj.show();
//     }
// }


//             Class Variable      //
// public class Basic02{
//     static int a=10;
//     public void get(){
//         System.out.println(a);
//     }
//     public static void show(){
//         System.out.println(a);
//     }
//     public static void main(String arg[]){
//         Basic02 obj = new Basic02();
//         obj.get();
//         obj.show();
//     }
// }

//          Global variabel    //
// public class Basic02{
    
//     public static int a=10;
//     public void get(){
//         System.out.println(a);
//         //a accessble here
//     }

//     {System.out.println(a);} //a accessble here

//     public static void main(String arg[]){
//         Basic02 obj = new Basic02();
//         obj.get();
//         System.out.println(a);
//         //a accessble here
//     }
// }


///      Block Varible     //
// public class Basic02{
//     public void get(){
//         if(true){
//             int a=5;
//             System.out.println(a);
//             //a is accessble
//         }

//         // System.out.println(a);
//          //a is not accessble
//     }
//     public static void main(String arg[]){
//         Basic02 obj =new Basic02();
//         obj.get();
//     }
// }