import java.util.Scanner;
class studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        studentdetails oute = new studentdetails();
        student_data st = oute.new student_data("John", 1, "Computer Science", 2);
        st.setName("ABC");
        String a = st.getName();
        System.out.println(a);
        System.out.println("Enter the totals number of students ");
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.println("Enter the ID of student " + (i + 1) + ": ");
            int id = sc.nextInt();
            System.out.println("Enter the branch of student " + (i + 1) + ": ");
            String branch = sc.next();
            System.out.println("Enter the year of student " + (i + 1) + ": ");
            int year = sc.nextInt();
            studentdetails outer = new studentdetails();
            student_data s = outer.new student_data(name, id, branch, year);
            s.display();
        }
        
    }

    class student_data {
        String name, branch;
        int id, year;

        student_data(String name, int id, String branch, int year) {
            this.name = name;
            this.id = id;
            this.branch = branch;
            this.year = year;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Branch: " + branch);
            System.out.println("Year: " + year);
        }
    
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public String getBranch (){
        return branch;
    }
    public int getYear(){
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
}
