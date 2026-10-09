import java.util.Scanner;
class sum_of_nums{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the ending number : ");
        int end = sc.nextInt();
        do{
            sum+=end;
            end--;
        } while(end>0);
        System.out.println("The sum of numbers from 1 to " + (end + 1) + " is : " + sum);
    }
}