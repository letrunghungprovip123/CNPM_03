public class Test {
    public static void main(String[] args) {
        People p1 = new People("John", 20, 180, 70);
        Student st = new Student("Jane", 21, 170, 60, "Computer Science", 20210001);
        System.out.println(p1.toString());
        System.out.println(st.toString());
    }
}
