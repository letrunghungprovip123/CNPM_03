public class People {
    private String name;
    private int age;
    private int height;
    private int weight;
    
    public People(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Height: " + height + ", Weight: " + weight;
    }

}
