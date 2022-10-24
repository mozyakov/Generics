import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ArrayList list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);

        //Animal animal = new Animal();
        Dog dog = new Dog();
        dog.hunt();
        dog.bark();
        Animal animal1 = new Dog();


    }
}