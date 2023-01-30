public class Person {
    private String name;
    private String position;
    private String placeOfWork;
    private int age;
    private double salary;

    public Person() {

    }

    public Person(String name, String position, String placeOfWork, int age, double salary) {
        this.name = name;
        this.position = position;
        this.placeOfWork = placeOfWork;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
