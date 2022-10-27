import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);
        String str1 = "First";
        String str2 = "Second";
        String str3 = "First";

        MagicBox<String> boxStr = new MagicBox<>(3);
        System.out.println(boxStr + " :null потому что бокс пустой");
        System.out.println(boxStr.add("First") + " :в бокс успешно добавлена строка First");
        //System.out.println("проверка содержимого, д.б. First " + boxStr);
        System.out.println(boxStr.add("try add") + " :false потому что бокс не пустой");
        System.out.println(boxStr);
        System.out.println("демонстрация boxStr завершена ====================");
        System.out.println();

        MagicBox<Integer> boxInt = new MagicBox<>(3);
        System.out.println("проверка содержимого, д.б. null " + boxInt);
        System.out.println(boxInt.add(100) + " :положили в бокс цифру 100");
        System.out.println(boxInt);
        System.out.println(boxInt.add(200) + " :200 не положилось, потому что бокс уже содержит 100"); //изменения не будет
        System.out.println(boxInt + " :осталось 100 как и должно быть"); //подтверждение что изменения нет
        System.out.println("демонстрация boxInt завершена ====================");

    }
}