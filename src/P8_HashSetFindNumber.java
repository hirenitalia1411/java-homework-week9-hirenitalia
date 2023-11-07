import java.util.HashSet;

public class P8_HashSetFindNumber {

    public static void main(String[] args) {

        HashSet<Integer> valueList = new HashSet<>();

        valueList.add(4);
        valueList.add(7);
        valueList.add(8);

        for(int i=1; i<= 10; i++){
            if (valueList.contains(i)){
                System.out.println("Number " + i + " is present in the HashSet");
            } else {
                System.out.println("Number " + i + " is not present in the HashSet");
            }
        }
    }
}
