package largerNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LargestNumberTest {
	private LargestNumber ln; // 선언하면 각 메소드 안에 ln 정의하지 않아도됨.
	@Before
	public void setUp() {
		ln = new LargestNumber();
	}
	@After
	public void tearDown() {
		;
	}
	
	// testCase는 기본적으로 하나의 메소드를 가짐.
	// @Test라는 어노테이션을 사용
	@Test
	public void test() {  // 메소드 이름이 하나의 test(ex.test)
		// LargestNumber ln = new LargestNumber();
		assertEquals(9, ln.getLargest(new int[] { 9, 8, 7 }));
		// 단정 메소드 - 테스트 케이스의 수행 결과를 판별
		// assertEquals : 두개의 값을 비교하는 문장
		// assertEquals(x,y)
		// x와 y가 같으면 테스트 통과
		
		// fail("not yet implemented...");
	}

	// testCase의 이름은 중복 x(에러나기때문)
	// test명은 번호보단 어떤 케이스인지 명시하는 것이 좋음
	
	// ln이라는 객체 생성후 값을 집어넣음.
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
