package Grade_Tracker;

public class MAIN {
    public static void main(String[] args){
        STUDENT_MANAGER studentManager = new STUDENT_MANAGER();

        studentManager.addStudent(1, "Alice", 85.5);
        studentManager.addStudent(2, "Bob", 90.0);
        studentManager.addStudent(3, "Charlie", 78.0);
        studentManager.addStudent(4, "David", 92.5);
        studentManager.addStudent(5, "Eve", 88.0);
        studentManager.displayStudents();
        studentManager.calculateAverageGrade();
        studentManager.findStudent(6);
        studentManager.removeStudent(2);
        studentManager.displayStudents();

    }
}
