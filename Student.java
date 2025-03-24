public class Student extends People {
    private String major;
    private int studentID;

    public Student(String name, int age, int height, int weight, String major, int studentID) {
        super(name, age, height, weight);
        this.major = major;
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
