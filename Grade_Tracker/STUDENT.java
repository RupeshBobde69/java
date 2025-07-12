package Grade_Tracker;

public class STUDENT{
    private String name;
    private Double grade;

    public STUDENT(String name, Double grade){
        this.name = name;
        this.grade = grade;
    }
    
    public Double getGrade(){
        return grade;
    }
    public String toString(){
        return "Name: " + name + ", Grade: " + grade;
    }
}

