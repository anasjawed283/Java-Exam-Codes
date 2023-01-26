//Read description for Question//
import java.util.*;
class Main{
    public static void main(String s[]){
        Scanner obj=new Scanner(System.in);
        String s1,s2;
        int i,j;
        s1=obj.nextLine();
        s2=obj.nextLine();
        char c1[]=s1.toCharArray();
        char c2[]=s1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int f1[]=new int[s1.length()];
        int f2[]=new int[s2.length()];
        if(s1.length()!=s2.length())
        System.out.println("Two strings are not Anagrams");
        else{
        for(i=0;i<s1.length();i++){
            for(j=i+1;j<s1.length();j++){
                if(c1[i]==c1[j]){
                    f1[i]++;
                    c1[j]=' ';
                }
                if(c2[i]==c2[j]){
                    f2[i]++;
                    c2[j]=' ';
                }
            }
            
        }
        int x=0;
        for(i=0;i<f1.length;i++)
        {
            if(f1[i]==f2[i])
            x=0;
            else
            {
            x=1;
            break;}
        }
        if(x==0)
        System.out.println("Given strings are Anagrams");
        else
        System.out.println("Given strings are not Anagrams");
        
    }}
}
