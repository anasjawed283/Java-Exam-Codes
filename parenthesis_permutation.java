import java.util.*;  
public class Main{
    public static void solve(int n,char[] str,int open,int close,int i)
    {
        if(open==n&&close==n)
        {
            System.out.println(new String(str));
        }
        else 
        {
            if(open<n)
            {
                str[i]='('; 
                solve(n,str,open+1,close,i+1);
            }
            if(open>close)
            {
                str[i]=')'; 
                solve(n,str,open,close+1,i+1);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        int n;  
        n=sc.nextInt();  
        int open=0,close=0; 
        char[] str=new char[2*n]; 
        solve(n,str,open,close,0);
        
    }
}
