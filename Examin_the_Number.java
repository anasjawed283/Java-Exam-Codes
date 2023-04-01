//Read Description for question
import java.util.*;
class Main
{
    public static boolean isArmstrong(int n)
    {
        int n1,r,sum=0;
        n1=n;
        while(n>0){
            r=n%10;
            sum+=(r*r*r);
            n=n/10;
        }
        if(sum==n1)
        return true;
        else
        return false;
        
    }
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            sum+=i;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
    public static void calcSum(int n)
    {
        int e=0,o=0,r;
        while(n>0){
            r=n%10;
            if(r%2==0)
            e+=r;
            else
            o+=r;
            n=n/10;
        }
        System.out.println("Even Sum:"+e);
        System.out.println("Odd Sum:"+o);
    }
    public static void main(String s[])
    {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        if(isArmstrong(num))
        System.out.println("It is an Armstrong Number");
        else
        System.out.println("It is not an Armstrong Number");
        if(isPerfect(num))
        System.out.println("It is a Perfect Number");
        else
        System.out.println("It is not a Perfect Number");
        calcSum(num);
    }
}
