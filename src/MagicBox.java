import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected T[] item;
    //private int count = 0; //это показатель что коробка пустая, с null T value не получался boolean add
    //protected T[] item = new T[3];
    //public Account[] accounts = new Account[3];
    public MagicBox(int maxCount) {
        item = (T[]) new Object[maxCount];
        //T[] item = (T[]) new Object[maxCount];
        //this.accounts = new Account[3];
    }
    /*public MagicBox(int maxCount) { //конструктор
        items = MagicBox[] savedArray  = new MagicBox[3] ;
    }*/

    /*public MagicBox() {
        T[] arrayItems = (T[]) new Object[3];
    }*/

    /*public void putValue(T[] item) { //параметр метода типа T
        //int i[] = ;
        this.item = item ;
    }*/

    public boolean add(T value) { //void add(Account account)
        for (int i = 0; i < item.length; i++) { //for (int i = 0; i < accounts.length; i++) {
            if (item == null) {  //значит бокс пустой  if (accounts[i] == null) {
                item[i] =  value ;  //accounts[i] = account;
                //macCount += 1;  //для запрета дальнейших попыток положить в бокс
                return true;
            }
        }return false;
    }
    /*public void showBox() { //показ элементов ящика
        for(T i : item ) {
            System.out.println(i + " ");
        }
    }*/
    public void getItem() { // возвращает объект типа T
            System.out.println(Arrays.toString(item));
        //return item;
    }
}

    /*public <T> T pick() throws RuntimeException {
        for(int i =0; i < item.length; i++) {
            if(item[i] == null) {
                throw new RuntimeException("ящик не полон, можно заполнить " + item.length + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt()(item.length);
        return randomInt;
    }*/
//public Account[] accounts = new Account[3];

