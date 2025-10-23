package PersonClass;

public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("John", 21);
        p1.setAge(5);
        System.out.println(p2.getAge()); // Should return 21
        p1.setName("Jim");
        p1.eat("Tacos"); // Eating Tacos
        p2.sleep(20); // Sleeping for 20 hour(s)
        for (int i = 0; i < 5; i++){
            p1.birthday(); // increases age by 5
        }
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.equals(p1)); // false
        Person p3 = new Person("Jack", 5);
        Person p4 = new Person("Jack", 5);
        System.out.println(p3.equals(p4)); //  true
    }
}
