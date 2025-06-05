package collections.set;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> members = new HashSet<>();

        members.add("도영");
        members.add("민덕");
        members.add("도영");

        System.out.println(members);
    }
}
