//Read Description for question
import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int value=s.nextInt();
try {
//int value = 30;
if (value < 40)
throw new Exception("Exception: Value too small");
System.out.println("The value is "+value);
 }
catch (Exception ex) {
 System.out.println(ex.getMessage());
 }
 finally{
 System.out.println("VIT University");
 }}
}
