//Read description for question
import java.util.*;
class Main{
    public static void main(String s[]){
    ArrayList a=new ArrayList(20);
    Scanner ss=new Scanner(System.in);
    int x;
    while((x=ss.nextInt())!=0){
        if(!(a.contains(x)))
        a.add(x);
    }
    
    for(int i=0;i<a.size();i++)
    System.out.print(a.get(i)+" ");
}}
