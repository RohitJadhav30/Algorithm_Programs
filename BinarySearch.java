public class BinarySearch {

    public static int binarySearch(String[] arr, String key){
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
        String[] arr = {"apple", "vivo", "realme", "motorola", "iqoo"};
        String key = "realme";
        int result = binarySearch(arr, key);
        
        if(result != -1){
            System.out.println("The given string is found at index: " + result);
        }
        else{
            System.out.println("the given string is not present in the list");
        }

    }
}
