import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class RecursiveSelectionSort {
    public static void sort(double[] list) {
        sort(list, 0, list.length-1);// Sort the entire list
        System.out.println(Arrays.toString(list));
    }
    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            // Find the smallest number and its index in list[low .. high]
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // Swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sort the remaining list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        double [] a = {2,5,8,9,1,4,3};
            sort(a);
        }

    }
