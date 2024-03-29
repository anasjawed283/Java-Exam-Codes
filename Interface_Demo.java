//Example
import java.util.*;
interface Shape
{
    String colour="Black";
    int bs=2;
    public void fillc();
    public void drawb();
    public void calcArea();
    
}
class Circle implements Shape
{
    public int r;
    Circle(int a)
    {
        r=a;
    }
    public void fillc()
    {
        System.out.println("Colour of Circle is "+colour);
    }
    public void drawb()
    {
        System.out.println("Border of Circle is "+bs);
    }
    public void calcArea()
    {
        System.out.println("radius = "+r);
        System.out.println("Area = "+r*r*3.14);
    }
}
class Square implements Shape
{
    public int s;
    Square(int b)
    {
        s=b;
    }
    public void fillc()
    {
        System.out.println("Colour of Square is "+colour);
    }
    public void drawb()
    {
        System.out.println("Border of Square is "+bs);
    }
    public void calcArea()
    {
        System.out.println("Side = "+s);
        System.out.println("Area = "+s*s);
    }
}
class Cylinder implements Shape
{
    public int r,h;
    Cylinder(int x,int y)
    {
        r=x;
        h=y;
    }
    public void fillc()
    {
        System.out.println("Colour of Cylinder is "+colour);
    }
    public void drawb()
    {
        System.out.println("Border of Cylinder is "+bs);
    }
    public void calcArea()
    {
        System.out.println("radius = "+r);
        System.out.println("height = "+h);
        System.out.println("Total Surface Area of Cylinder = "+(2*3.14*r*(h+r)));
    }
    public void calcVol()
    {
        System.out.println("Volume of Cylinder = "+3.14*r*r*h);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rad=sc.nextInt();
        Circle obj=new Circle(rad);
        obj.fillc();
        obj.drawb();
        obj.calcArea();
        int side=sc.nextInt();
        Square obj1=new Square(side);
        obj1.fillc();
        obj1.drawb();
        obj1.calcArea();
        int l=sc.nextInt();
        int b=sc.nextInt();
        Cylinder obj2=new Cylinder(l,b);
        obj2.fillc();
        obj2.drawb();
        obj2.calcArea();
        obj2.calcVol();
    }
}
