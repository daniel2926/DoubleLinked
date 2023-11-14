import java.util.SortedSet;
import java.util.TreeSet;

public class ImplTreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add("Daniel");
        set.add("Kevin");
        set.add("Azarya");
        set.add("Rafin");
        set.add("Caca");

        //Azarya,caca,Daniel,Kevin,Rafin
        System.out.println("Sorted = " + set);

//        System.out.println("first() = " + set.first());
//        System.out.println("last() = " + set.last());
//        System.out.println("head() = " + set.headSet("Daniel"));
//        System.out.println("last() = " + set.tailSet("Daniel"));

        //abcdefghijklmnopqrstuvwxyz
        System.out.println("lower(\"\"): " + set.lower("Rafin"));
        System.out.println("higher(\"P\"): " + set.higher("K"));
        System.out.println("floor(\"\"): " + set.floor("R"));
        System.out.println("ceiling(\"P\"): " + set.ceiling("P"));
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("New tree set: " + set);

    }
}
