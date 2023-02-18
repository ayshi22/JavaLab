public class Employee {
    int Id;
    String name;
    Employee(int Id,String name)
    {
        this.Id= Id;
        this.name=name;
    }
    void info()
    {
        System.out.println("ID = "+Id+  "\nName = "+name);
    }

    public static void main(String[] args) {
        Employee obj1= new Employee(2345, "Abcd");
        Employee obj2= new Employee(3675, "Xyz");
        obj1.info();
        obj2.info();
    }
}
