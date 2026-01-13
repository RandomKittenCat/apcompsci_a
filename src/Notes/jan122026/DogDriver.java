package Notes.jan122026;
import java.util.ArrayList;

public class DogDriver {
    public static void main(String[] args){
        ArrayList<Dog> ken = new ArrayList<Dog>();

        ken.add(new Dog("A", 7));
        ken.add(new Dog("B", 5));
        ken.add(new Dog("C", 6));
        ken.add(new Dog("D", 10));
        ken.add(new Dog("E", 8));

        System.out.println(ken);
        removeByAge(ken, 7);
        System.out.println(ken); // B is left, because after removing index 0, b becomes index 0
        // as index 0 was already passed over, B is left behind without being checked
    }

    public static void removeByAge(ArrayList<Dog> k, int age){

        for (int i = 0; i < k.size(); i++){ // going thru each element in array
            if(k.get(i).getAge() <= age){ // checking if that objects age is less than or equal to age provided
                k.remove(i); // removing that Dog object
                i--; // ***FIXES ERROR EXPLAINED ON 16 and 17***
            }
        }
    }
}
