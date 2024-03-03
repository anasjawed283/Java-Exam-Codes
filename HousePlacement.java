/* In the city of tokio there are N number of houses noddy is looking for a piece of land in the city to build his house 
he wants to build his house in such a way that the distance between his house and the nearest house should be maximum. 
You are given the positions of the houses in the city find the positions of the houses between which noddy can build his house. 
If there are multiple such positions then print the house number which is minimum. If there is no such position then print -1.*/

import java.util.*;

public class HousePlacement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        // Read the number of houses
        int N = obj.nextInt();
        
        // Read the positions of the houses
        int[] positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = obj.nextInt();
        }
        
        // ascending order
        Arrays.sort(positions);
        
        int startHouse = 0;
        int endHouse = 0;
        int maxDistance = 0;
        
        for (int i = 1; i < N; i++) {
            int distance = positions[i] - positions[i-1];
            if (distance > maxDistance) {
                maxDistance = distance;
                startHouse = positions[i-1] + 1;
                endHouse = positions[i] - 1;
            }
        }
        
        System.out.println("House numbers between to build largest house: " + startHouse + " and " + endHouse);
        
        obj.close();
    }
}
