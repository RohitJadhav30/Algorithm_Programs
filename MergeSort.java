import java.util.Arrays;

public class MergeSort {

    public static void merge(String[] arr, String[] arr1, int low, int mid, int high){
        System.arraycopy(arr, low, arr1, low, high - low);

        int i = low, j = mid;

        for(int k = low; k < high; k++){
            if(i >= mid){
                arr[k] = arr1[j++];
            }
            else if (j >= high){
                arr[k] = arr1[i++];
            }
            else if (arr1[i].compareTo(arr1[j]) <= 0){
                arr[k] = arr1[i++];
            }
            else{
                arr[k] = arr1[j++];
            }
        }
    }

    public static void sort(String[] arr, String[] arr1, int low, int high){
        if(high - low <= 1){
            return;
        }

        int mid = low + (high - low)/2;

        sort(arr, arr1, low, mid);
        sort(arr, arr1, mid, high);
        merge(arr, arr1, low, mid, high);
    }

    public static void mergeSort(String[] arr){
        String[] arr1 = new String[arr.length];
        sort(arr, arr1, 0, arr.length);
        
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "vivo", "realme", "motorola", "iqoo"};

        System.out.println("Orignal array: " + Arrays.toString(arr));
        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));


    }
}
