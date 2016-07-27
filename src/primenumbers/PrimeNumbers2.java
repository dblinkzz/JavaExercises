package primenumbers;

public class PrimeNumbers2 {
    public static void main(String[] args) {
        int limit = 100;
        boolean isPrime = true;
        
        for (int i = 2; i < limit; i++) { 
            for (int j = 2; j < i; j++) {
                isPrime = true;
                    if( i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
