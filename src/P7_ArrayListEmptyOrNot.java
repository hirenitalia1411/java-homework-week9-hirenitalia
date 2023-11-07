import java.util.ArrayList;

public class P7_ArrayListEmptyOrNot {

    public static void main(String[] args) {

        ArrayList<Integer> valueList = new ArrayList<>();

        valueList.add(5);
        valueList.add(10);

        System.out.println("Is array list is empty: " + valueList.isEmpty());
    }
}
