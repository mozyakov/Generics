public class MagicBox<T> {
    private T item;
    
    public void putItem(T item) { //параметр метода типа T
        this.item = item;
    }

    public T getItem() { // возвращает объект типа T
        return item;
    }


}
