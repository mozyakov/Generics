import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random1 = new Random();
        int randomInt = random1.nextInt(5);

        MagicBox<String> boxStrok1 = new MagicBox<>();
        System.out.println(boxStrok1 + " :null потому что бокс пустой");
        System.out.println(boxStrok1.add("First") + " :в бокс успешно добавлена строка First");
        //System.out.println("проверка содержимого, д.б. First " + boxStrok1);
        System.out.println(boxStrok1.add("what") + " :false потому что бокс не пустой");
        System.out.println(boxStrok1);
        System.out.println("демонстрация boxStrok1 завершена ====================");
        System.out.println();

        MagicBox<String> boxStrok2 = new MagicBox<>();
        boxStrok2.add("Second");
        System.out.println(boxStrok2 + " :в бокс успешно добавлена строка Second");
        System.out.println("демонстрация boxStrok2 завершена ====================");
        System.out.println();

        MagicBox<Integer> boxInter1 = new MagicBox<>();
        System.out.println("проверка содержимого, д.б. null " + boxInter1);
        System.out.println(boxInter1.add(100) + " :успешно положили в бокс цифру 1");
        System.out.println(boxInter1);
        System.out.println(boxInter1.add(200) + " :200 не положилось, потому что бокс уже содержал 100"); //изменения не будет
        System.out.println(boxInter1 + " :осталось 100 как и должно быть"); //подтверждение что изменения нет
        System.out.println("демонстрация boxInter1 завершена ====================");
        System.out.println();


    }
}