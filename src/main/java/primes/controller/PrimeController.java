package primes.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import primes.Prime;
import primes.generator.PrimeGenerator;


@RestController
public class PrimeController {
	
	@Autowired
	private PrimeGenerator primeGenerator;
	
	private ConcurrentMap<Integer, Prime> cachedPrimes = new ConcurrentHashMap<Integer, Prime>();
	
	@RequestMapping(value="/primes/{max}")
	public Prime getPrimes(@PathVariable("max") int max)
	{
		List<Integer> primes =  primeGenerator.generatePrimes(max);
		return new Prime(max, primes);
	}
	
	

}
