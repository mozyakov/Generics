import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Random random1 = new Random();
        //int randomInt = random1.nextInt(5);

        MagicBox<String> boxStr = new MagicBox<>(3);
        boxStr.getItem();
        //boxStr.putValue([0], "First");
        boxStr.add("Fe");
        System.out.println();
        boxStr.getItem();
        System.out.println();
        System.out.println();

        MagicBox<Integer> boxInt = new MagicBox<>(5);
        //System.out.println();
        boxInt.getItem();






    }
}