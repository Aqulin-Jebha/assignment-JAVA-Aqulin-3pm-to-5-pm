class Student {

    // Instance variables (stored in object)
    String studentName;
    int rollNumber;

    // Constructor to initialize instance variables
    Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    // Method to calculate total marks
    void calculateTotal() {

        // Local variables (exist only inside this method)
        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 88;

        int totalMarks = mark1 + mark2 + mark3;

        System.out.println("Total Marks: " + totalMarks);
    }

    // Display student details
    void display() {
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Akhil", 101);

        s1.display();
        s1.calculateTotal();
    }
}