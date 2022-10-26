import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);

        MagicBox<String> boxString1 = new MagicBox<>();
        MagicBox<String> boxString2 = new MagicBox<>("Second");
        MagicBox<String> boxString3 = new MagicBox<>();

        //System.out.println(boxString1.getValue());
        boxString1.putValue("First");
        //boxString2.putValue("Second");



       // System.out.println(boxString1.getValue());

        //System.out.println(boxString1);
        //System.out.println(boxString2.getItem());
        //System.out.println(boxString3.getItem());

        //System.out.println(boxString.add("Roma"));
        //MagicBox<String> boxString4 = new MagicBox<>();
        //System.out.println(boxString4.add("Roma"));

    }
}