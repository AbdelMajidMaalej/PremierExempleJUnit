package triangle;

import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleTest {
	
	@Test
	public void testInvalide()
	{
		int a=1,b=3,c=1;
		int testOutput=Triangle.triangle(a, b, c);
		int realOutput=0;
		assertEquals(realOutput, testOutput);
		System.out.println("Test Invalid Passed !");
		
	}
	
	@Test
	public void testeEqui()
	{
		int a=2,b=2,c=2;
		int testOutput=Triangle.triangle(a, b, c);
		int realOutput=1;
		assertEquals(realOutput, testOutput);
		System.out.println("Test Equilateral Passed !");
		
	}
	
	@Test
	public void testeIsocele()
	{
		int a=3,b=2,c=2;
		int testOutput=Triangle.triangle(a, b, c);
		int realOutput=2;
		assertEquals(realOutput, testOutput);
		System.out.println("Test Isocele Passed !");
		
	}

}
