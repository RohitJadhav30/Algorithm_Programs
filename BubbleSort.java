import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j <n-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,8,6,9,18,22,45,23,12};

        System.out.println("orignal array: " + Arrays.toString(arr));

        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(arr)));


    }
}
