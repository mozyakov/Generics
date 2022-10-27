public class MagicBox<T> {
    private T value;
    private int count = 0; //это показатель что коробка пустая, с null T value не получался boolean add
    private final int countMax = 1; //кол-во объектов которое можно положить в него
    public MagicBox() {} //конструктор оставил только такой
    /*public MagicBox(T value) {
        this.value = value;
        this.count = count = 1;
    }*/

    /*public MagicBox() {
        MagicBox[] savedArray  = new MagicBox[3] ;
    }*/

    /*public MagicBox() {
        T[] arrayItems = (T[]) new Object[3];
    }*/

    public void putValue(T value) { //параметр метода типа T
        this.value = value;
    }

    public boolean add(T value) {
        if (count == 0) {  //значит бокс пустой
            this.value = value;
            count += 1;  //для запрета дальнейших попыток положить в бокс
            return true;
        } else {
            return false;
        }
    }

    public T getValue() { // возвращает объект типа T
        return value;
    }
    @Override
    public String toString() {
        return "Содержимое коробки = "  + value;
    }
    //public Account[] accounts = new Account[3];
}

