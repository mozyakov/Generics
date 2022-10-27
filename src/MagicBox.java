import java.util.*;
public class MagicBox<T> {
    protected T[] item;
    public MagicBox(int maxCount) {
        item = (T[]) new Object[maxCount];
    }
    public boolean add(T value) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] =  value ;
                return true;
            }
        }return false;
    }
    public void getItem() {
            System.out.println(Arrays.toString(item));
    }
    public T pick() throws RuntimeException {
        for(int i =0; i < item.length; i++) {
            if(item[i] == null) {
                throw new RuntimeException("ящик не полон, нужно заполнить " + (item.length - i) + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt((item.length));
        System.out.println(item[(randomInt)]);
        return  item[(randomInt)];
    }
}


