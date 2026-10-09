import java.util.Scanner;
class linear_search{
    public static void main(String[] args){
        linearsearch();
    }
    public static int linearsearch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("The number "+key+" is found at index "+i);
                return i;
            }
        }
        System.out.println("The number "+key+" is not found in the array");
        return -1;
    }
}