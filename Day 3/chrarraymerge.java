import java.util.Scanner;

public class chrarraymerge {
    static char[] merge(char[] a, char[] b) {

        char[] result = new char[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            result[k] = a[i];
            k++;
        }
        for (int i = 0; i < b.length; i++) {
            result[k] = b[i];
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        char[] a = sc.nextLine().toCharArray();
        System.out.print("Enter the second string: ");
        char[] b = sc.nextLine().toCharArray();
        char[] merged = merge(a, b);
        System.out.println("Merged array: " + new String(merged));
        sc.close();
    }
}