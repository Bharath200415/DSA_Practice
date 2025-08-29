
import java.util.*;

class Incrementalsieve {
    static ArrayList<Integer> incrementalSieve(int limit) {
        if (limit < 2) {
            return new ArrayList<>(); // Return empty list for limit < 2
        }
        // Initialize primes list with 2
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);

        // Initialize isComposite array
        boolean[] isComposite = new boolean[limit + 1];
        // No need to mark 0, 1, or 2 as composite (2 is prime, 0 and 1 are not)
        for (int i = 4; i <= limit; i += 2) {
            isComposite[i] = true; // Mark even numbers > 2 as composite
        }

        // Check odd numbers starting from 3
        int nextNum = 3;
        while (nextNum <= limit) {
            boolean isPrime = true;
            int sqrtNextNum = (int) Math.sqrt(nextNum);

            // Check divisibility by primes up to sqrt(nextNum)
            for (int prime : primes) {
                if (prime > sqrtNextNum) {
                    break;
                }
                if (nextNum % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If nextNum is prime, add it and mark its multiples
            if (isPrime) {
                primes.add(nextNum);
                // Mark multiples starting from nextNum * nextNum
                // Use step of 2 * nextNum to skip even multiples
                for (long i = (long) nextNum * nextNum; i <= limit; i += 2 * nextNum) {
                    isComposite[(int) i] = true;
                }
            }

            // Move to next odd number
            nextNum += 2;
        }

        return primes;
    }

    public static void main(String[] args) {
        // Test cases
        int limit = 30;
        ArrayList<Integer> primes = incrementalSieve(limit);
        System.out.println("Primes up to " + limit + ": " + primes);
        
    }
} 
    

