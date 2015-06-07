package prime;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import primes.generator.PrimeGenerator;
import primes.generator.SimplePrimeGeneratorImpl;

public class PrimeGeneratorUnitTest {

	PrimeGenerator primeGenerator = new SimplePrimeGeneratorImpl();
	
	@Test
	public void testThreeIsPrime()
	{
		Assert.assertTrue(primeGenerator.isPrime(3));
	}
	
	@Test
	public void testFourIsNotPrime()
	{
		Assert.assertFalse(primeGenerator.isPrime(4));
	}
	
	@Test
	public void testPrimeGeneration()
	{
		List<Integer> expected = Arrays.asList(1,2,3,5,7);
		List<Integer> actual =  primeGenerator.generatePrimes(10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPrimeGenerationForOne()
	{
		List<Integer> expected = Collections.EMPTY_LIST;
		List<Integer> actual =  primeGenerator.generatePrimes(1);
		Assert.assertEquals(expected, actual);
	}
}
