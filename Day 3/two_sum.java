import java.util.Scanner;
class two_sum{
    public static void main (String[] args){
        int[] indices = twosum();
        if (indices[0] == -1) {
            System.out.println(-1);
        } else {
            System.out.println("Indices: " + indices[0] + " and " + indices[1]);
        }
    }
    public static int[] twosum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter numbers ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number ");
        int target = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}