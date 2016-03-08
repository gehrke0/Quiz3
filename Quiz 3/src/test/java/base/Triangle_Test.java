package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);
	}

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	double P;

	public void test_getArea() {
		double Area = Triangle.getArea();
		assertTrue(Area == 24);
	}

	public void test_getPerimeter() {
		double Perim = Triangle.getPerimeter();
		assertTrue(Perim == 3);
	}
}
