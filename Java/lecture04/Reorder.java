package lecture04;

import java.util.Arrays;

public class Reorder {
    public Reorder() {
        int[] arr = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
        int j = 0;
        for (int item : arr) {
            if (item != 0) {
                arr[j] = item;
                j++;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }


        System.out.println(Arrays.toString(arr));
    }
}
