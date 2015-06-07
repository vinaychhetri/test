package primes.generator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service("SimplePrime")
public class SimplePrimeGeneratorImpl implements PrimeGenerator {

	@Override
	public List<Integer> generatePrimes(int max) {
		List<Integer> primes = new ArrayList<Integer>();

		// loop through the numbers one by one
		for (int i = 1; i < max; i++) {
			if (isPrime(i))
			{
				primes.add(i);
			}
		}
		return primes;
	}

	@Override
	public boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
