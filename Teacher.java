public class Teacher extends People {
    private String department;
    private int teacherID;

    public Teacher(String name, int age, int height, int weight, String department, int teacherID) {
        super(name, age, height, weight);
        this.department = department;
        this.teacherID = teacherID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }    
}
