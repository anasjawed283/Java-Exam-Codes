//Read Description for question//
import java.util.*;
abstract class GeometricObject{
private String color;
private boolean filled;
public GeometricObject(){
    color="White";
    filled=false;
}
public GeometricObject(String s,boolean b){
    color=s;
    filled=b;
}
public boolean isFilled(){
return filled;
}
public String getColor(){
    return color;
}
public void setColor(String s){
    color=s;
}
public void setFilled(boolean b){
    filled=b;
}
public abstract double getArea();
public abstract double getPerimeter();
}
class Circle extends GeometricObject{
    private double radius;
    public Circle(){
        radius=1.0;
    }
    public Circle(double d){
        radius=d;
    }
    public Circle(double d,String s, boolean f){
        super(s,f);
        radius=d;
        
    }
    public void setRadius(double d){
        radius=d;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public void printCircle(){
        System.out.println("Radius:"+radius);
    }
    }
    class Main{
        public static void main(String args[]){
            Circle c1=new Circle();
            c1.setRadius(3.2);
             System.out.println("Circle Object 1");
            c1.printCircle();
            System.out.println("Area:"+c1.getArea());
            System.out.println("Perimeter:"+c1.getPerimeter());
            System.out.println("Color:"+c1.getColor());
            System.out.println("Filled:"+c1.isFilled());
            Circle c2=new Circle(2.0);
            //c1.setRadius(1.0);
             System.out.println("Circle Object 2");
            c2.printCircle();
            System.out.println("Area:"+c2.getArea());
            System.out.println("Perimeter:"+c2.getPerimeter());
            System.out.println("Color:"+c2.getColor());
            System.out.println("Filled:"+c2.isFilled());
            Circle c3=new Circle(3.0,"Black",true);
            //c1.setRadius(1.0);
             System.out.println("Circle Object 3");
            c3.printCircle();
             System.out.println("Area:"+c3.getArea());
             System.out.println("Perimeter:"+c3.getPerimeter());
             System.out.println("Color:"+c3.getColor());
            System.out.println("Filled:"+c3.isFilled());
        }
    }
