public class Swap {
    public static void main(String arg[]) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}