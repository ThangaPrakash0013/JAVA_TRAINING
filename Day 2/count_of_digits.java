import java.util.Scanner;

class count_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            number = Math.abs(number);
            while (number > 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("The number of digits in the entered number is : " + count);
    }
}
