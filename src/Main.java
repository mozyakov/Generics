public class Main {
    public static void main(String[] args) {
        MagicBox<String> boxStr = new MagicBox<>(3); //максимум три элемента
        boxStr.add("Первый"); //добавляем в ячейку
        //boxStr.pick(); //если раскомментировать то будет исключение с правильным числом незаполненных ячеек 2
        boxStr.getItem(); //покажет массив с заполненной первой ячейкой, а остальные null
        boxStr.add("Второй");
        boxStr.add("Третий");
        boxStr.add("Четвёртый"); //этот уже не добавится
        boxStr.getItem();
        boxStr.pick(); //покажет значение случайного элемента

        System.out.println();

        MagicBox<Integer> boxInt = new MagicBox<>(3); ////максимум три элемента
        boxInt.add(100);
        boxInt.add(200);
        boxInt.add(300);
        boxInt.add(400); //этот уже не добавится
        boxInt.getItem();
        boxInt.pick(); //покажет значение случайного элемента
    }
}