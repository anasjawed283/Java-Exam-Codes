//Read Description for question
import java.util.*;

class Main{
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int i;
        int arr[] = new int[n+1];
        for(i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int pos,ele;
        pos = input.nextInt();
        ele = input.nextInt();
        for(i=n;i>=pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = ele;
        for(i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
