import java.util.Arrays;

public class GenericInsertionSort{

    public static <T extends Comparable<T>> T[] insertionSort(T[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            T key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j].compareTo(key) > 0){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }


    public static void main(String[] args) {
        //String
        String[] arr = {"apple", "vivo", "realme", "motorola", "iqoo"};
        System.out.println("Orignal array: " + Arrays.toString(arr));

        System.out.println("Sorted array is: " + Arrays.toString(insertionSort(arr)));

        //Integer
        Integer[] arr1 = {5,10,8,6,9,18,22,45,23,12};
        System.out.println("Orignal array: " + Arrays.toString(arr1));

        System.out.println("Sorted array is: " + Arrays.toString(insertionSort(arr1)));

    }
}