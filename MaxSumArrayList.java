import java.util.ArrayList;
import java.util.Scanner;

public class HighestAdjacentSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Taking input from the user
        System.out.println("Enter numbers (enter any non-integer value to stop):");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        
        // Finding the sum of two adjacent numbers with the highest value
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        for (int i = 0; i < numbers.size() - 1; i++) {
            int sum = numbers.get(i) + numbers.get(i + 1);
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        
        // Displaying the result
        if (maxIndex != -1) {
            System.out.println("The sum of the two adjacent numbers with the highest value is: " + maxSum);
            System.out.println("Those numbers are: " + numbers.get(maxIndex) + " and " + numbers.get(maxIndex + 1));
        } else {
            System.out.println("There are no adjacent numbers to find the sum.");
        }
        
        scanner.close();
    }
}
