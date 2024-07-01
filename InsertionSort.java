import java.util.Arrays;

public class InsertionSort{

    public static String[] insertionSort(String[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            String key = arr[i];
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
        String[] arr = {"apple", "vivo", "realme", "motorola", "iqoo"};
        System.out.println("Orignal array: " + Arrays.toString(arr));

        System.out.println("Sorted array is: " + Arrays.toString(insertionSort(arr)));
    }
}