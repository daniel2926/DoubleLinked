import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLength {
    public static void main(String[] args) {
        String [] cities ={"Atlanta", " Savannah" , "NewYork", "Dallas"};

        Arrays.sort(cities, new Mycomparator());
        for (String s : cities
             ) {
            System.out.println(s + " ");

        }

    }

    public static class Mycomparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
