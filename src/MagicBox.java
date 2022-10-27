public class MagicBox<T> {
    protected T[] item;
    //private int count = 0; //это показатель что коробка пустая, с null T value не получался boolean add

    public MagicBox(int maxCount) {
        item = (T[]) new Object[maxCount];
    }

    /*public MagicBox(int maxCount) { //конструктор
        items = MagicBox[] savedArray  = new MagicBox[3] ;
    }*/

    /*public MagicBox() {
        T[] arrayItems = (T[]) new Object[3];
    }*/

    public void putValue(T[] item) { //параметр метода типа T
        this.item = item;
    }

    /*public boolean add(T items) {
        if (T[] items == null) {  //значит бокс пустой
            this.item = item;
            count += 1;  //для запрета дальнейших попыток положить в бокс
            return true;
        } else {
            return false;
        }
    }*/
    public void showBox() { //показ элементов ящика
        for(T i : item ) {
            System.out.print(i + " ");
        }
    }
    public T[] getItem() { // возвращает объект типа T
        return item;
    }


    //public Account[] accounts = new Account[3];
}

