// how to make class and objects
class Pen{  //this is a class which is defining properties and methods
    String color;
    String type;
    public void printcolor(){
        System.out.println("Apperance of "+ this.color+  "is amazing");
    }
    public void printtype(){
        System.out.println("Apperance of "+ this.type+   "is incedible");
    }   
}
public class first {  // this a main class and always remember its name should be same as file name
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="purple";
        pen1. type="Ball";
        pen1.printcolor(); // accessing the methods & function of class pen
        pen1.printtype();
    }
}