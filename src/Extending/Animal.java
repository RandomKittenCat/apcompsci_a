package Extending;

public class Animal {
    private String name;
    private int age;

    public Animal(){
        name="Jim";
        age=1;
    }

    public void bark(){
        System.out.println("bark");
    }

    public void meow(){
        System.out.println("meow");
    }

    public void birthday(){
        age++;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}