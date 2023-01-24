//READ DISCRIPTION FOR QUESTION
import java.util.*;
class Main
{
    public static void main(String s[])
    {
        int n,r,total=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        while(n>0)
        {
            r=n%10;
            total+=r;
            n=n/10;
        }
        System.out.println(total);
        
    }
}

//This Code is contributed by Anas Jawed
