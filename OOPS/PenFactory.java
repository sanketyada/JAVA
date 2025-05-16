public class PenFactory{
    public static void main(String args[]){

        //Creating First Pen
        Pen p1 = new Pen();

        p1.setName("Elkos");
        p1.setColor("Blue");
        p1.setLifeTime(2);
        p1.setPenTip(6);
        System.out.println(p1.name);
        System.out.println(p1.color);
        System.out.println(p1.lifeTime);
        System.out.println(p1.penTip);
    }
}

class Pen{
    String name;
    String color;
    int lifeTime;
    int penTip;

    void setColor(String newColor){
        color = newColor;
    }
    void setName( String newName){
        name = newName;
    }
    void setLifeTime(int newLifeTime){
        lifeTime = newLifeTime;
    }
    void setPenTip(int newPentip){
        penTip = newPentip;
    }
}