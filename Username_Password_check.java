//Read description for question//
import java.util.*;
class Main
{
    public static boolean checkUser(String ss)
    {
        if(!(ss.length()>=8&&ss.length()<=32)){
        return false;}
        else
        {
        if(!(Character.isLetter(ss.charAt(0))))
        return false;
        else{
        for(int i=0;i<ss.length();i++)
        {
            if(!(Character.isLetter(ss.charAt(i))||Character.isDigit(ss.charAt(i))||ss.charAt(i)=='_'))
            return false;
        }
        }}
        return true;
        
    }
    public static boolean checkPass(String ss)
    {
        if(ss.equals("admin123")||ss.equals("VITadmin!")||ss.equals("StudScope153*"))
        return true;
        else
        return false;
    }
    public static void main(String s[])
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        if(checkUser(s1)){
            if(checkPass(s2))
            System.out.println("Welcome,"+s1);
            else
            System.out.println("Wrong Password");
        }
        else
        System.out.println("Invalid Username");
    }
}
