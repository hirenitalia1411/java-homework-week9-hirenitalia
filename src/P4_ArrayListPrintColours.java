import java.util.ArrayList;

public class P4_ArrayListPrintColours {

    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList();
        colour.add("White");
        colour.add("Black");
        colour.add("Blue");
        colour.add("Red");
        colour.add("Orange");

        for (String c : colour) {
            System.out.println(c);
        }
    }
}
