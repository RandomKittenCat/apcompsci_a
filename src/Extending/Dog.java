package Extending;

public class Dog extends Animal{
    public static void main(String[] args){
        Dog myDog = new Dog();

        myDog.bark();
        System.out.println(myDog.getAge());
        myDog.birthday();
        System.out.println(myDog.getAge());
    }
}