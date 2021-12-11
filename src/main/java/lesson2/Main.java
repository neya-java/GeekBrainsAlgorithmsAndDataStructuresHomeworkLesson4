package lesson2;

import lesson2.search.BinarySearch;
import lesson2.search.InterpolationSearch;
import lesson2.sort.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;
        final int SIZE = 20000;
        Integer[] arr = MyArray.getArray(SIZE, 2);

//        System.out.println(Arrays.toString(arr));

        SpeedTest.startTime();

//        BubbleSort.sort(arr); //при 50000 время 12115
//        CocktailSort.sort(arr); //13120
//        CombSort.sort(arr); //45
//        SelectionSort.sort(arr); //3237
//        InsertionSort.sort(arr); //2503
//        PigeonholeSort.sort(arr); //19
        Arrays.sort(arr); //27



        SpeedTest.endTime();

        System.out.println(Arrays.toString(arr));

        System.out.println(BinarySearch.search(arr, 30000));
        System.out.println(InterpolationSearch.search(arr, 30000));


    }
}
