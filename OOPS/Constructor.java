public class Constructor{
    public static void main(String arg[]){
        Pen p1  = new Pen();
        Pen p2  = new Pen("Elkos");  
        System.out.println(p2.name);
    }
}

class Pen{
    String name;
    int price;

    Pen(){               //Non Paremeterized Constructor
        System.out.println("Hiii this is non=parematrized constructor");
    }
    Pen(String name){   ///Parameterized Constructure
        this.name = name;
    }
}