import java.util.Scanner;

public class mergesortedarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sorted array
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();

        // Input second sorted array
        int m = sc.nextInt();
        int[] br = new int[m];
        for (int i = 0; i < m; i++) br[i] = sc.nextInt();

        // Array to hold the merged result
        int[] cr = new int[n + m];
        
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge them in sorted order
        while (i < n && j < m) {
            if (ar[i] <= br[j]) {
                cr[k++] = ar[i++];
            } else {
                cr[k++] = br[j++];
            }
        }

        // Copy remaining elements of ar[], if any
        while (i < n) {
            cr[k++] = ar[i++];
        }

        // Copy remaining elements of br[], if any
        while (j < m) {
            cr[k++] = br[j++];
        }

        // Print the merged sorted array
        for (int x : cr) {
            System.out.print(x + " ");
        }
        
        sc.close();
    }
}