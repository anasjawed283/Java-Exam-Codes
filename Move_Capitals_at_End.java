//Read Description for question
import java.util.*;
public class Main
{
    public static void main(String...args)
    {
        Scanner sob=new Scanner(System.in);
        String s=sob.next();
        String small="",big="";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i]>=65 && c[i]<=90)
            {
                big=big+c[i];
            }
            else
            {
                small=small+c[i];
            }
        }
        System.out.print(small+big);
    }
}
