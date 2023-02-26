import java.sql.SQLOutput;

public class Person {
    private String name;
    private int id;
    public Person(String name, int id)
    {
        this.name=name;
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Person obj1= new Person("abc",20);
        System.out.println(obj1.getName());
        System.out.println(obj1.getId());
    }
}
