package primes;

import java.util.List;

public class Prime {
	
	private final int initial;
	private final List<Integer> primes;

	
	public Prime(int initial, List<Integer> primes) {
		this.initial = initial;
		this.primes = primes;
	}


	public int getInitial() {
		return initial;
	}


	public List<Integer> getPrimes() {
		return primes;
	}
	
	

	
}
