import java.util.ArrayList;
import java.util.Iterator;

public class P5_ArrayListIterator {

    public static void main(String[] args) {

        ArrayList<Integer> value = new ArrayList<>();
        value.add(5);
        value.add(10);
        value.add(15);
        value.add(20);
        value.add(25);

        Iterator<Integer> list = value.iterator();
        while(list.hasNext()){
            System.out.print(list.next()+ "  ");
        }
    }
}
