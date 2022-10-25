
public class MagicBox<T> {
    private T item;

    public MagicBox() {
        T[] items = (T[]) new Object[3];
    }

    public void putItem(T item) { //параметр метода типа T
        this.item = item;
    }
    public boolean add(T item) {
        if(item == null) {
            add(item);
            return true;
        }
        return false;
    }

    public T getItem() { // возвращает объект типа T
        return item;
    }

//public Account[] accounts = new Account[3];
}
