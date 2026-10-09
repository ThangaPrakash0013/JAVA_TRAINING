import java.util.Scanner;
class min_max{
    public static void main(String[] args){
        minmax();
    }
    public static int[] minmax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The minimum number in the array is "+min);
        System.out.println("The maximum number in the array is "+max);
        //second min and max
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){   
            if(arr[i]<secondMin && arr[i]!=min){
                secondMin = arr[i];
            }
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println("The second minimum number in the array is "+secondMin);
        System.out.println("The second maximum number in the array is "+secondMax);
        return new int[]{min, max, secondMin, secondMax};
    }
}