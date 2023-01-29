//Read description for question//
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
