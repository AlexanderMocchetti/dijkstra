import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> l = new TreeSet<>();
        TreeSet<Integer> w = new TreeSet<>();
        l.add(3);
        l.add(2);
        l.add(1);
        w.add(2);
        w.add(3);
        w.add(1);
        System.out.println(l);
        System.out.println(w);
        System.out.println(l.equals(w));
    }
}
