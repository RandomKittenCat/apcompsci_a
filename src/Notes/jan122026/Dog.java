package Notes.jan122026;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public String toString() {
        return "Dog Name: " + name + " Age: " + age;
    }
}
