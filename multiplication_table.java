import java.util.Scanner;
class multiplication_table{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number to find in table : ");
int num = sc.nextInt();
for (int i=1;i<=10;i++){
System.out.printf("%d x %d = %d%n", num, i, num * i);
}
}
}