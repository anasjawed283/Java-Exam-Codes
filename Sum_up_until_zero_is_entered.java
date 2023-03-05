//Read Description for question
import java.util.*;
class Main
{
    public static void main(String s[])
    {
        Scanner ss=new Scanner(System.in);
        int x,sum=0;
        
        while((x=ss.nextInt())!=0)
        {
            sum+=x;
        }
        System.out.println(sum);
    }
}
