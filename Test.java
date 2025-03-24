public class Test {
    public static void main(String[] args) {
        People p1 = new People("John", 20, 180, 70);
        Student st = new Student("Jane", 21, 170, 60, "Computer Science", 20210001);
        Employee e = new Employee("Tom", 30, 175, 75, "IT", 20210002);
        System.out.println(p1.toString());
        System.out.println(st.toString());
        System.out.println(e.toString());
        Teacher t1 = new Teacher("Jane", 30, 170, 60, "Computer Science", 1234);
        System.out.println(p1.toString());
        System.out.println(t1.toString());
    }
}
