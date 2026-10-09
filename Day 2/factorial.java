import java.util.Scanner;
class factorial{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number to find factorial : ");
int num = sc.nextInt();
int factorial = 1;
do{
    factorial *= num;
    num--;
} while(num > 0);
System.out.println("The factorial is : " + factorial);
}
}