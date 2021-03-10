package pid.exercise.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        // TODO Implement bubble sort
        int n = array.length;
        for (int i = 1; i < n; i++)
            for (int j = 0; j < n-1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }   
            }
    }
    public static void main(String[] args){
        BubbleSort ob = new BubbleSort();
        int array[] = {23,12,11,1};
        ob.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
