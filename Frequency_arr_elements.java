//Read Description for Question
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        int f[] = new int[10];
        int i, count = 1, n, j;
        n = s.nextInt();
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
            f[i] = -1;
        }
        for (i = 0; i < n; i++) {
            count = 1;
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    f[j] = 0;
                }
            }
            if (f[i] != 0) {
                f[i] = count;
            }
        }
        for (i = 0; i < n; i++) {
            if (f[i] != 0) {
                System.out.println(a[i] + " is occuring " + f[i] + " times");
            }
        }
    }

}
