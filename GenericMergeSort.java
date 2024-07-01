import java.util.Arrays;

public class GenericMergeSort <T extends Comparable<T>>{

    public void merge(T[] arr, T[] arr1, int low, int mid, int high){
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

    public void sort(T[] arr, T[] arr1, int low, int high){
        if(high - low <= 1){
            return;
        }

        int mid = low + (high - low)/2;

        sort(arr, arr1, low, mid);
        sort(arr, arr1, mid, high);
        merge(arr, arr1, low, mid, high);
    }

    public void mergeSort(T[] arr){
        T[] arr1 = Arrays.copyOf(arr, arr.length);
        sort(arr, arr1, 0, arr.length);
        
    }
    public static void main(String[] args) {
        //String
        String[] arr = {"apple", "vivo", "realme", "motorola", "iqoo"};

        GenericMergeSort<String> sorting = new GenericMergeSort<>();

        System.out.println("Orignal array: " + Arrays.toString(arr));
        sorting.mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        //Integer
        Integer[] arr1 = {5,10,8,6,9,18,22,45,23,12};

        GenericMergeSort<Integer> numSort = new GenericMergeSort<>();
        System.out.println("Orignal array: " + Arrays.toString(arr1));

        numSort.mergeSort(arr1);
        System.out.println("Sorted array is: " + Arrays.toString(arr1));


    }
}
