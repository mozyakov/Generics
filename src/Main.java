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
        System.out.println("Блок boxStrok1 завершен ====================");

        MagicBox<String> boxStrok2 = new MagicBox<>();
        boxStrok2.add("Second");
        System.out.println("Блок boxStrok2 завершен ====================");

        MagicBox<Integer> boxInter1 = new MagicBox<>();
        System.out.println("проверка содержимого, д.б. null " + boxInter1);
        System.out.println(boxInter1.add(1));
        System.out.println(boxInter1);
        System.out.println(boxInter1.add(200) + " :200 не стало, потому что бокс уже содержал 1"); //изменения не будет
        System.out.println(boxInter1 + " :осталось 1 как и должно быть"); //подтверждение что изменения нет


    }
}