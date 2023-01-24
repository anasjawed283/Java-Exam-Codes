//Read description for question//

import java.util.Scanner;
class Main {
  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = obj.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    System.out.println(sum);
  }
}

//This code is contributed by Anas Jawed//
