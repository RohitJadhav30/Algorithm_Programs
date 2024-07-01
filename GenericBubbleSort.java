import java.util.Arrays;

public class GenericBubbleSort {

    public static <T extends Comparable<T>> T[] bubbleSort(T[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j <n-i-1; j++){
                if(arr[j].compareTo(arr[j + 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //Integer
        Integer[] arr = {5,10,8,6,9,18,22,45,23,12};

        System.out.println("orignal array: " + Arrays.toString(arr));

        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(arr)));

        //String
        String[] str = {"apple", "vivo", "realme", "motorola", "iqoo"};
        System.out.println("orignal array: " + Arrays.toString(str));

        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(str)));


    }
}
