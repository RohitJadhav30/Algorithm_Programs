import java.util.Scanner;

public class Prime {

    public static void PrintPrime(int limit){
        for(int i = 2; i <= limit; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        sc.close();

        PrintPrime(num);

    }
}
