import java.util.*;

public class MagicBox<T> {
    private T value;
    //private int countItems = 3;
    //public MagicBox() {}
    public MagicBox(T value) {
        this.value = value;
        //this.countItems = countItems;
    }

    public MagicBox() {
        MagicBox[] T = new MagicBox[3];
    }

    /*public MagicBox() {
        T[] items = (T[]) new Object[3];
    }*/

    public void putValue(T value) { //параметр метода типа T
        this.value = value;
    }
    public boolean add(T value ) {
        if(value == null) {
            add(value);
            return true;
        }
        return false;
    }

    public T getValue() { // возвращает объект типа T
        return value;
    }

    @Override
    public String toString() {
        return "value = " + value;
    }
    //public Account[] accounts = new Account[3];
}
