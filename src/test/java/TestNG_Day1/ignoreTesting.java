package TestNG_Day1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ignoreTesting {
	@BeforeTest
	public void setUp() {
		System.out.println("BeforeTest");
	}
	@Test
	public void test1() {
		System.out.println("Test");
	}
	@AfterTest
	public void tearDown() {
		System.out.println("AfterTest");
	}
}
