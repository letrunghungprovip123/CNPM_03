public class Employee {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String department;
    private int employeeID;

    public Employee(String name, int age, int height, int weight, String department, int employeeID) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.department = department;
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Height: " + height + ", Weight: " + weight + ", Department: " + department + ", EmployeeID: " + employeeID;
    }
}
