import java.util.Scanner;
class binary_search{
    public static void main(String[] args){
        binarysearch();
    }
    public static void binarysearch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers in sorted order");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        boolean found = false;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                found = true;
                break;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(found){
            System.out.println("The number " + key + " is found in the array");
        }
        else{
            System.out.println("The number " + key + " is not found in the array");
        }
    }
}