package Grade_Tracker;
import java.util.Map;
import java.util.TreeMap;

public class STUDENT_MANAGER {
    private TreeMap<Integer, STUDENT> students = new TreeMap<>();

    public void addStudent(int id, String name, Double grade){
        students.put(id, new STUDENT(name, grade));
    }

    public void removeStudent(int id){
        if(students.containsKey(id)){
            students.remove(id);
            System.out.println("Student with ID " + id + " has been removed.");
        }else{
            System.out.println("Student with ID " + id + " does not exist.");
        }
    }

    public void findStudent(int id){
        STUDENT s = students.get(id);
        if(s != null){
            System.out.println("Found student: " + s);
        }else{
            System.out.println("Student with ID " + id + " does not exist.");
        }
    }

    public void calculateAverageGrade(){
        if(students.isEmpty()){
            System.out.println("No students available to calculate average grade.");
            return;
        }
        double total = 0.0;
        for(STUDENT s : students.values()){
            total += s.getGrade();
        }
        Double average = total / students.size();
        System.out.println("Average grade of all students: " + average);
    }
    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No students available.");
            return;
        }
        System.out.println("List of students:");
        for(Map.Entry<Integer, STUDENT> entry : students.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
