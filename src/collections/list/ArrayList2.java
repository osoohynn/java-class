package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("BMW");
        cart.add("Audi");
        cart.add(1, "포카칩");
        cart.add(2, "꼬북칩");
        cart.remove(0);

        for (String c : cart) {
            System.out.println(c);
        }
    }
}
