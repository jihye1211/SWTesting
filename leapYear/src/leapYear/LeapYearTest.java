// 배화여자대학교 스마트 IT과 3학년 A반
// 201831019 곽지혜
package leapYear;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LeapYearTest {
	
	private LeapYear lYear;
	@Before
	public void setUp() {
		System.out.println("Before Test");
		lYear = new LeapYear();
	}
	@After
	public void tearDown() {
		System.out.println("After Test");
	}
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Test Class started");
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Test Class finished");
	}
	@Test
	public void firstTest() {
		assertTrue(lYear.isLeapYear(2020));
	}
	@Test
	public void secondTest() {
		assertFalse(lYear.isLeapYear(2019));
		// assertTrue("윤년이 아닙니다.",lYear.isLeapYear(2019));
		// 실행 시 실패 메세지인 '윤년이 아닙니다'를 나타냄
	}
	@Test
	public void ThirdTest() {
		assertFalse(lYear.isLeapYear(100));
	}
	@Test
	public void FourthTest() {
		assertTrue(lYear.isLeapYear(2000));
	}
	@Test
	public void fifthTest() {
		assertFalse(lYear.isLeapYear(1999));
	}

}
