import java.util.Scanner;
class movie_booking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("       WELCOME TO AGS CINEMAS            ");
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("CURRENTLY RUNNING SHOWS");
        System.out.println("1.Avengers:Endgame");
        System.out.println("2.Avengers:Doomsday");
        System.out.println("3.Avengers:Infinity War");
        System.out.print("Please select a movie: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        if (choice == 1){
            System.out.println("You have selected Avengers:Endgame");
            System.out.println("Available show times are: 10:00 AM, 2:00 PM, 6:00 PM");
            System.out.print("Please select a show time: ");
            String showTime = sc.nextLine();
            if (showTime.equals("10:00 AM")){
                System.out.println("You have selected 10:00 AM show");

            }
            else if (showTime.equals("2:00 PM")){
                System.out.println("You have selected 2:00 PM show");
                   
            }
            else if (showTime.equals("6:00 PM")){
                System.out.println("You have selected 6:00 PM show");
                 
            }
            else{
                System.out.println("Invalid show time");
            }

        }
        else if (choice == 2){
            System.out.println("You have selected Avengers:Doomsday");
            System.out.println("Available show times are: 11:00 AM, 3:00 PM, 7:00 PM");
            System.out.print("Please select a show time: ");
            String showTime = sc.nextLine();
            if (showTime.equals("11:00 AM")){
                System.out.println("You have selected 11:00 AM show");
                  
            }
            else if (showTime.equals("3:00 PM")){
                System.out.println("You have selected 3:00 PM show");
                   
            }
            else if (showTime.equals("7:00 PM")){
                System.out.println("You have selected 7:00 PM show");
                ;    
            }
            else{
                System.out.println("Invalid show time");
            }
        }
        else if (choice == 3){
            System.out.println("You have selected Avengers:Infinity War");
            System.out.println("Available show times are: 12:00 PM, 4:00 PM, 8:00 PM");
            System.out.print("Please select a show time: ");
            String showTime = sc.nextLine();
            if (showTime.equals("12:00 PM")){
                System.out.println("You have selected 12:00 PM show");
                   
            }
            else if (showTime.equals("4:00 PM")){
                System.out.println("You have selected 4:00 PM show");
                  
            }
            else if (showTime.equals("8:00 PM")){
                System.out.println("You have selected 8:00 PM show");
                
            }
            else{
                System.out.println("Invalid show time");
            }
        }
       
        
        else{
            System.out.println("Invalid choice");
        }

    }
    }