package Task_4.Clean_code;

import static org.junit.Assert.*;

import org.junit.Test;

import Task_4.Clean_code.Bill;

public class GenerateBillTest{

	@Test
	public void testCost() {
		Bill test= new Bill();
		assertEquals(3600.00,test.totalcost("standard material", 3),0);
	}
	@Test
	public void testCost1() {
	  Bill test= new Bill();
		assertEquals(6000.00,test.totalcost("Abovestandard material", 4),0);
	}
	@Test
	public void testCost2() {
		Bill test= new Bill();
		assertEquals(3600.00,test.totalcost("Highstandard material", 2),0);
	}
	@Test
	public void testCost3() {
		Bill test= new Bill();
		assertEquals(10000.00,test.totalcost("HighstandardFullautomatic", 4),0);

}
}