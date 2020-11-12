package fixtureExample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FixtureExampleTest {
	
	@Before
	public void setUp() {
		System.out.println("Before Test");
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
		System.out.println("First Test runs...");
	}
	@Test
	public void secondTest() {
		System.out.println("Second Test runs...");
	}
	@Test
	public void ThirdTest() {
		System.out.println("Third Test runs...");
	}

}
