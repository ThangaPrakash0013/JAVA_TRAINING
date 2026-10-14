import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class student_data{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name = sc.nextLine();
        System.out.println("Enter his dept: ");
        String dept = sc.nextLine();
        System.out.println("Enter his rollno ");
        int rollno = sc.nextInt();
        
    try{
        FileWriter filewriter = new FileWriter("student.txt");
        filewriter.write("Student Name: " + name + "\n" + "Department: " + dept + "\n" + "RollNo: "+ rollno);
        filewriter.close();
    }
    catch(IOException ioexception){
        System.out.println("Error occured while writing to the file");
    }
    
    }}

    //to implement the CRUD operations
    //to use multipe files to support the main like name a seperate class / file