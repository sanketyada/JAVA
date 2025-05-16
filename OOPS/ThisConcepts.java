//Getter,Setter and This object
//this refer the currrent object

public class  ThisConcepts{
    public static void main(String args[]){
        Pen  p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(6);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
       return this.color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    int getTip(){
        return this.tip;
    }


}