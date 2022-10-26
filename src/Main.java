import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);

        MagicBox<String> boxStrok1 = new MagicBox<>("Navsegda");
        //MagicBox<Integer> boxInter1 = new MagicBox<>();
        //MagicBox<String> boxStrok2 = new MagicBox<>();


        //System.out.println(boxStrok1.getValue());
        System.out.println(boxStrok1);
        System.out.println(boxStrok1.add("First"));
        //boxStrok1.putValue("First"); //этот метод работает
        System.out.println(boxStrok1);

        /*for (int i = 0; i < 3; i++) {
            System.out.println(boxStrok1);
        }*/
        //System.out.println(boxStrok2);
        //System.out.println(boxInter1.add(5));
        //System.out.println(boxInter1);

        //System.out.println(boxStrok2.add("Second"));  //почему-то всё время возвращает false
        // System.out.println(boxStrok1.getValue());
        //System.out.println(boxStrok1);
        //System.out.println(boxStrok2.getItem());
        //System.out.println(boxString3.getItem());
        //System.out.println(boxString.add("Roma"));
        //MagicBox<String> boxString4 = new MagicBox<>();
        //System.out.println(boxString4.add("Roma"));

    }
}