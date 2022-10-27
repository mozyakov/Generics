//import java.util.Arrays;
//import java.util.Random;
import java.util.*;

public class MagicBox<T> {
    protected T[] item;
    //protected T[] item = new T[3];
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
            if (item[i] == null) {  //значит бокс пустой  if (accounts[i] == null) {
                item[i] =  value ;  //accounts[i] = account;
                //macCount += 1;  //для запрета дальнейших попыток положить в бокс
                return true;
            }
        }return false;
    }

    public void getItem() { // возвращает объект типа T
            System.out.println(Arrays.toString(item));
        //return item;
    }
    public <T> int pick() throws RuntimeException {
        for(int i =0; i < item.length; i++) {
            if(item[i] == null) {
                throw new RuntimeException("ящик не полон, нужно заполнить " + (item.length-i) + " ячеек");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt((item.length));
        return  randomInt;
    }
}


//public Account[] accounts = new Account[3];

