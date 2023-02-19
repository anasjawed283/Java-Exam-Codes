//Read Description for question
import java.util.*;
class Main
{
    public static void checkPrime(int x)
    {
        int i,flag=0;
        if (x==0||x==1){
        System.out.println(x+" "+"is neither Prime nor Composite");}
        else{
        for(i=2;i<x/2;i++)
        { if(x%i==0) {
            flag=1;
            break; }
            else
            flag=0;
        }
        if(flag==0)
        System.out.println(x+" "+"is a Prime Number");
        else
        System.out.println(x+" "+"is not a Prime Number");
    }}
    public static void checkPerfect(int x)
    {
        int sum=0;
        if(x!=0){
        for(int i=1;i<x;i++)
        {
            if(x%i==0)
            sum+=i;
        }
       
        if(sum==x)
        System.out.println(x);}
    }
    public static void printSum(int a[])
    {
        int e=0,o=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            e+=a[i];
            else
            o+=a[i];
        }
        System.out.println("Even Sum:"+e);
        System.out.println("Odd Sum:"+o);
    }
    public static void main(String s[])
    {
    int n;
    Scanner sp=new Scanner(System.in);
    int i;
    n=sp.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sp.nextInt();
        checkPrime(a[i]);
    }
     System.out.println("Perfect Numbers:");
    for(i=0;i<n;i++)
    checkPerfect(a[i]);
    printSum(a);
    }
}
