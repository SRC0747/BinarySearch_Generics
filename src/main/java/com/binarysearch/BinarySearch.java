package com.binarysearch;
import java.util.ArrayList;

public class BinarySearch<T>{
    private T[] a;

    public BinarySearch(T[] words) {
        a = words;
    }

    public int search(T v) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];

            double compareTo = v.compareTo(midVal);
            if (compareTo < 0) {
                low = mid - 1;
            }

            else if (compareTo > 0) {
                high = mid  + 1;
            }
        }

        return -1;
    }

    public int compareTo(T a) {
        return this.value.compare - b;
    }
}
