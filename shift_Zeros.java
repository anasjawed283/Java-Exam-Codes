//Read description for question//
import java.util.*;
class Main{
  public static void main(String[] args){
    int n;
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
    int i,zeros=0;
    int arr[] = new int[n];
    for(i=0;i<n;i++){
      arr[i] = obj.nextInt();
      if(arr[i] == 0){
        zeros += 1;
      }
    }
    int arr2[] = new int[n];
    for(i=0;i<n;i++){
      if(arr[i]!=0){
        arr2[zeros] = arr[i];
        zeros++;
      }
    }
    for(i=0;i<n;i++){
      System.out.print(arr2[i]+" ");
    }
  }
}
//This code is contributed by Anas Jawed//
