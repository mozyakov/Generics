import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);

        MagicBox<String> boxString = new MagicBox<>();
        boxString.putItem("First");
        boxString.putItem("Second");
        boxString.putItem("Third");

        System.out.println(boxString.getItem());
        //System.out.println(boxString2.getItem());
        //System.out.println(boxString3.getItem());

        //System.out.println(boxString.add("Roma"));
        MagicBox<String> boxString4 = new MagicBox<>();
        //System.out.println(boxString4.add("Roma"));












    }
}