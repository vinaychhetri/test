package primes.generator;

import java.util.List;

public interface PrimeGenerator {

	List<Integer> generatePrimes(int max);
	
	public boolean isPrime(int max);
	
}
