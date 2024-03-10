import java.util.*;

public class WaysProduct {
    public static int countWays(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i != i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = obj.nextInt();
        int ways = countWays(number);
        System.out.println("Number of ways to represent " + number + " as the product of two distinct numbers: " + ways);
    }
}
//Can also be used to check prime as number of ways would be 1
// combination should be unique 7*2 and 2*7 is considerd same
