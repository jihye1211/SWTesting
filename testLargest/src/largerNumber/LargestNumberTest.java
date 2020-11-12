package largerNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LargestNumberTest {
	private LargestNumber ln; // �����ϸ� �� �޼ҵ� �ȿ� ln �������� �ʾƵ���.
	@Before
	public void setUp() {
		ln = new LargestNumber();
	}
	@After
	public void tearDown() {
		;
	}
	
	// testCase�� �⺻������ �ϳ��� �޼ҵ带 ����.
	// @Test��� ������̼��� ���
	@Test
	public void test() {  // �޼ҵ� �̸��� �ϳ��� test(ex.test)
		// LargestNumber ln = new LargestNumber();
		assertEquals(9, ln.getLargest(new int[] { 9, 8, 7 }));
		// ���� �޼ҵ� - �׽�Ʈ ���̽��� ���� ����� �Ǻ�
		// assertEquals : �ΰ��� ���� ���ϴ� ����
		// assertEquals(x,y)
		// x�� y�� ������ �׽�Ʈ ���
		
		// fail("not yet implemented...");
	}

	// testCase�� �̸��� �ߺ� x(�������⶧��)
	// test���� ��ȣ���� � ���̽����� ����ϴ� ���� ����
	
	// ln�̶�� ��ü ������ ���� �������.
	@Test
	public void testAscending() {
		// LargestNumber ln = new LargestNumber();
		assertEquals(9, ln.getLargest(new int[] { 7, 8, 9 }));
		// fail("not yet implemented...");
	}

	@Test
	public void testSingleValue() {
		// LargestNumber ln = new LargestNumber();
		assertEquals(9, ln.getLargest(new int[] { 9 }));
		// fail("not yet implemented...");
	}

	@Test
	public void testDuplicated() {
		// LargestNumber ln = new LargestNumber();
		assertEquals(9, ln.getLargest(new int[] { 7, 9, 9 }));
		// fail("not yet implemented...");
	}

}
