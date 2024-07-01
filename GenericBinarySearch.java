public class GenericBinarySearch {

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T key){
        int length = arr.length;
        int low = 0;
        int high = length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int index = key.compareTo(arr[mid]);

            if( index < 0){
                high = mid - 1;
            }
            else if(index > 0){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //String
        String[] arr = {"apple", "vivo", "realme", "motorola", "iqoo"};
        String key = "realme";
        int result = binarySearch(arr, key);

        //Integer
        Integer[] arr1 = {5,10,8,6,9,18,22,45,23,12};
        int key1 = 18;
        int result1 = binarySearch(arr1, key1);

        
        if(result != -1){
            System.out.println("The given string is found at index: " + result);
        }
        else{
            System.out.println("the given string is not present in the list");
        }

        if(result1 != -1){
            System.out.println("The given string is found at index: " + result1);
        }
        else{
            System.out.println("the given string is not present in the list");
        }

    }
}
