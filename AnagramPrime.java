import java.util.Arrays;

public class AnagramPrime {

    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num){
        int orignal = num;
        int rem = 0, sum = 0;

        while(num != 0){
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }
        return orignal == sum;
    }

    public static boolean isAnagram(int num){
        String numStr1 = String.valueOf(num);
        char[] charStr1 = numStr1.toCharArray();

        Arrays.sort(charStr1);
        String sortedStr1 = new String(charStr1);

        for(int i = 0; i < 1000; i++){
            if(i != num && isPrime(i)){
                String numStr2 = String.valueOf(i);
                char[] charStr2 = numStr2.toCharArray();

                Arrays.sort(charStr2);

                String sortedStr2 = new String(charStr2);

                if(sortedStr1.equals(sortedStr2)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; i++){
            if(isPrime(i) && isPalindrome(i) && isAnagram(i)){
                System.out.println(i + " ");
            }
        }
    }
}
