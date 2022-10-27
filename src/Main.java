import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);

        MagicBox<String> boxStr1 = new MagicBox<>();
        System.out.println(boxStr1 + " :null потому что бокс пустой");
        System.out.println(boxStr1.add("First") + " :в бокс успешно добавлена строка First");
        //System.out.println("проверка содержимого, д.б. First " + boxStr1);
        System.out.println(boxStr1.add("try add") + " :false потому что бокс не пустой");
        System.out.println(boxStr1);
        System.out.println("демонстрация boxStr1 завершена ====================");
        System.out.println();


        MagicBox<Integer> boxInt1 = new MagicBox<>();
        System.out.println("проверка содержимого, д.б. null " + boxInt1);
        System.out.println(boxInt1.add(100) + " :успешно положили в бокс цифру 100");
        System.out.println(boxInt1);
        System.out.println(boxInt1.add(200) + " :200 не положилось, потому что бокс уже содержал 100"); //изменения не будет
        System.out.println(boxInt1 + " :осталось 100 как и должно быть"); //подтверждение что изменения нет
        System.out.println("демонстрация boxInt1 завершена ====================");
        System.out.println();


    }
}