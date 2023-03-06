//Read question for description
import java.util.Scanner;

class Person {
    public String name;
    public int age;

    Person() {
        name = "*";
        age = 0;
    }

    public void getdata(Scanner sc) {
        name = sc.next();
        age = sc.nextInt();
    }

    public void putdata() {
        System.out.println(name + " " + age);
    }
}

class Professor extends Person {
    public int publications;
    static int Empid = 0;

    Professor() {
        publications = 0;
        Empid++;
    }

    public void getdata(Scanner sc) {
        name = sc.next();
        age = sc.nextInt();
        publications = sc.nextInt();
    }

    public void putdata() {
        System.out.println(name + " " + age + " " + publications + " ID:" + Empid);
    }
}

class Student extends Person {
    int[] m = new int[3];
    static int studID = 0;

    Student() {
        studID++;
    }

    public void getdata(Scanner sc) {
        name = sc.next();
        age = sc.nextInt();
        for (int i = 0; i < 3; i++)
            m[i] = sc.nextInt();
    }

    public void putdata() {
        System.out.println(name + " " + age + " " + m[0] + " " + m[1] + " " + m[2] + " ID:" + studID);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Professor();
        p1.getdata(sc);
        p1.putdata();
        p1 = new Professor();
        p1.getdata(sc);
        p1.putdata();
        p1 = new Student();
        p1.getdata(sc);
        p1.putdata();
        p1 = new Student();
        p1.getdata(sc);
        p1.putdata();
    }
}
