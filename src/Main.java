import java.util.*;


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
        Animal animal1 = new Dog(); //создан объект класса Дог
        animal1.eat();  //собака кушает, птмч Оbj класса Дог
        System.out.println(list);
        System.out.println("==================");
        /*LinkedList list2 = new LinkedList<>();
        for (Object o : list) {
            list2.add(o);
            list2 = new LinkedList<>(list);
        }
        System.out.println(list2);
         */

        //List<Integer> list1 = new ArrayList<>();
        LinkedList list2 = new LinkedList<>();
        for (int i=0; i < list.size(); i++) {
            list2.add(i);
            list2 = new LinkedList<>(list);
        }

        System.out.println(list2);





    }
}