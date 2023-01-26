//Read Description for Question
import java.util.Scanner;
class Main
{
    public static void main(String s[])
    {
        int n,i,f=1;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if(n==0)
        f=1;
        for(i=1;i<=n;i++)
        f*=i;
        System.out.println(f);
        
    }
}
//This code is contributed by Anas Jawed//
