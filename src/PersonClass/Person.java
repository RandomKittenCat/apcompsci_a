package PersonClass;

public class Person {
    private String name = "";
    private int age;

    public Person(){
        name = "";
        age = 0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){this.age = age;}
    public void setName(String name){this.name = name;}
    public int getAge(){return age;}
    public String getName(){return name;}

    public void eat(String food){System.out.println("Eating " + food);}
    public void sleep(int time){System.out.println("Sleeping for " + time + " hour(s)");}
    public void birthday(){age++;}

    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
    public boolean equals(Object other){
        if (other instanceof Person) {
            Person p = (Person) other;
            return this.name.equals(p.name) && this.age == p.age;
        }
        return false;
    }
}
