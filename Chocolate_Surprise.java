//Read Description for question
import java.util.*;
public class Main{
    public static void main(String u[]){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int f,s,t;
        f=0;
        s=1;
        System.out.print(f+" ");
        System.out.print(s+" ");
        for(int i=2;i<n;i++){
            t=f+s;
            f=s;
            s=t;
            System.out.print(t+" ");
        }
    }
}
