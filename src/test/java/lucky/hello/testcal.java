package lucky.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcal {

	@Test
	public void testadd() {
		int result = 5;
		cal aaa = new cal();
		assertEquals(result,aaa.Add(2,3));
		//fail("Not yet implemented");
	}
	@Test
	public void testsub() {
		int result2 = 1;
		cal bbb = new cal();
		assertEquals(result2,bbb.sub(3, 2));
		//fail("Not yet implemented");
	}
	@Test
	public void testmul() {
		int result3 = 6;
		cal ccc = new cal();
		assertEquals(result3,ccc.mul(2, 3));
		//fail("Not yet implemented");
	}
	@Test
	public void testdiv() {
		int result4 = 2;
		cal ddd = new cal();
		assertEquals(result4,ddd.div(4, 2));
		//fail("Not yet implemented");
	}


}
