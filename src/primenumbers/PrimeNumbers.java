package primenumbers;

class PrimeNumbers
{
    public static void main(String[] args) {
        int numberToCheck = 12;
        boolean isPrime = true;
        
        for(int i = 2; i < numberToCheck; i++) {
            if ( numberToCheck % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(numberToCheck + " is prime");
        } else {
            System.out.println(numberToCheck + " is not prime");
        }
        
    }
}



