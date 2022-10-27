import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);
        String str1 = "First";
        String str2 = "Second";
        String str3 = "First";

        MagicBox<String> boxStr = new MagicBox<>(3);
        boxStr.showBox();
        boxStr.putValue([0]"First");
        boxStr.showBox();




    }
}