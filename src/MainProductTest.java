import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//abcdefghijklmnopqrstuvwxyz

public class MainProductTest {
    public static void main(String[] args) {
        ArrayList<Product> arrayList = new ArrayList<Product>();
        arrayList.add(new Product("Matcha", 10000, "Hot"));
        arrayList.add(new Product("RedVelvet", 15000,"Cold"));
        Collections.sort(arrayList);
        for (Product p:arrayList) {
            System.out.println(( p.getPrice() + " "));
        }
       NameComparator nameComparator = new NameComparator();
        Collections.sort(arrayList,nameComparator);
        for (Product p1: arrayList
             ) {
            System.out.println(p1.getNameProduct() + " ");
        }

    }

    static class NameComparator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            return o1.getNameProduct().compareTo(o2.getNameProduct());
        }
    }
}
