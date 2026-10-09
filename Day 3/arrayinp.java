import java.util.Scanner;
class arrayinp{
    public static void main(String[] args){ 
        arrinp();
    }
    public static int arrinp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            
        }
        if (sum% 2 == 0){
            System.out.println("The sum of the array "+sum+ " is even");
        }
        else{
            System.out.println("The sum of the array "+sum+ " is odd");
        }
        return sum;
    }
}