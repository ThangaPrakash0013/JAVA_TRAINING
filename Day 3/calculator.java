import java.util.*;
class calculator{
    public static void main(String [] args){
        System.out.println("Welcome to the calculator");
        System.out.println("Please select an operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter your choice: ");
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The result of addition is: " + add());
                        break;
                    case 2:
                        System.out.println("The result of subtraction is: " + subtract());
                        break;
                    case 3:
                        System.out.println("The result of multiplication is: " + multiply());
                        break;
                    case 4:
                        System.out.println("The result of division is: " + divide());
                        break;
                    case 5:
                        System.out.println("Exiting the calculator");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); 
            }
        }
       
    }
    public static int add(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        return a+b;
    }
    public static int subtract(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        return a-b;
    }
    public static int multiply(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        return a*b;
    }
    public static int divide(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        return a/b;
    }
}