//Example
import java.util.Scanner;
import java.util.ArrayList;

class Queue<T> {
    private ArrayList<T> mArr;
    
    public Queue() {
        mArr = new ArrayList<>();
    }
    
    public void push(T val) {
        mArr.add(val);
    }
    
    public T pop() {
        if (mArr.size() < 1) return null;
        return mArr.remove(0);
    }
    
    public String toString() {
        String res = "";
        for (int i = 0; i < mArr.size(); ++i) {
            res += mArr.get(i).toString() + (i+1 == mArr.size() ? "" : " ");
        }
        return res;
    }
}

public class Main {
    private static <T> void print(Queue<T> q) {
        System.out.println("Queue insert done");
        System.out.println("Queue is: " + q);
        System.out.println("Queue is deleted: " + q.pop());
        System.out.println("Queue is deleted: " + q.pop());
        System.out.println("Queue is: " + q);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> qi = new Queue<>();
        for (int i = 0; i < 6; ++i) qi.push(sc.nextInt());
        System.out.println("Queue Contents: " + qi);
        qi.push(sc.nextInt());
        print(qi);
        
        sc.nextLine();
        Queue<String> qs = new Queue<>();
        for (int i = 0; i < 6; ++i) qs.push(sc.next());
        System.out.println("Queue is: " + qs);
        qs.push(sc.next());
        print(qs);
        
        Queue<Double> qd = new Queue<>();
        for (int i = 0; i < 6; ++i) qd.push(sc.nextDouble());
        System.out.println("Queue is: " + qd);
        qd.push(sc.nextDouble());
        print(qd);
    }
}
