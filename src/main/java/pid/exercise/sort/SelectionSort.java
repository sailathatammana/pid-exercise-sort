package pid.exercise.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        // TODO Implement selection sort
        int n = array.length;
        // Outer array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            // Swap the found minimum element with the first
            // element
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args){
        SelectionSort ob = new SelectionSort();
        int array[] = {23,11,12,1};
        ob.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
