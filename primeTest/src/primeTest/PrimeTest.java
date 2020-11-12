package primeTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {

	@Before
	public void setUp() {
	}
	@Test
	public void testWith3() {
		Prime nPrime = new Prime();
		assertTrue("3 is primeNumber", nPrime.getResult(3));
		//assertTrue(nPrime.getResult(3));
	}
	
	@Test
	public void testWith4() {
		Prime nPrime = new Prime();
		assertFalse("4 is non-primeNumber",nPrime.getResult(4));
		// 기대결과가 false이기 때문에 테스트 수행
		
		// ""을 통해 String 값을 넣으면 테스트가 안될 때 결과 값을 확인할 수 있음
		// 테스트 케이스가 성공했을 경우 출력 x, 성공하지 않았을 경우 string 값 출력
	}
	
	@Test
	public void testWith1234() {
		Prime nPrime = new Prime();
		assertFalse("1221 is non-primeNumber",nPrime.getResult(1221));
	}



}
