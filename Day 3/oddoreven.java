import java.util.Scanner;
class oddoreven{
    public static void main(String[] args){
        oddnorevenn();
    }
    public static int oddnorevenn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int a = sc.nextInt();
        switch(a%2){
            case 0:
                System.out.println("The number " + a + " is even");
                break;
            case 1:
                System.out.println("The number " + a + " is odd");
                break;
        }
        return a;
    }
}