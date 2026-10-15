
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}