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
		// ������� false�̱� ������ �׽�Ʈ ����
		
		// ""�� ���� String ���� ������ �׽�Ʈ�� �ȵ� �� ��� ���� Ȯ���� �� ����
		// �׽�Ʈ ���̽��� �������� ��� ��� x, �������� �ʾ��� ��� string �� ���
	}
	
	@Test
	public void testWith1234() {
		Prime nPrime = new Prime();
		assertFalse("1221 is non-primeNumber",nPrime.getResult(1221));
	}



}
