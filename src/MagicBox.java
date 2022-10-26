public class MagicBox<T> {
    private T value;
    //private int countItems = 0;
    //private int maxCountItems = 1;
    public MagicBox() {} //конструктор по умолчанию
    public MagicBox(T value) {
        this.value = value;
        //this.countItems = countItems;
    }

    /*public MagicBox() {
        MagicBox[] savedArray  = new MagicBox[3] ;
    }*/

    /*public MagicBox() {
        T[] arrayItems = (T[]) new Object[3];
    }*/

    public void putValue(T value) { //параметр метода типа T
        this.value = value;
    }

        public boolean add(T value ) { //это резерв
        if(value != null)
            this.value = value;
            return true;
        }
        /*public boolean add(T value ) { //это резерв
        if(value == null) {
            this.value = value;
            return true;
        }
        return false;
    }*/
    public T getValue() { // возвращает объект типа T
        return value;
    }

    @Override
    public String toString() {
        return "Содержимое коробки = "  + value;
    }
    //public Account[] accounts = new Account[3];
}
