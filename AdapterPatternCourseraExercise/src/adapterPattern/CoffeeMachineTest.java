package adapterPattern;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CoffeeMachineTest {

	@Test
	public void testSelection1() {
		assertTrue(CoffeeTouchscreenAdapter.chooseCoffee(1));
	}
	
	@Test
	public void testSelection2() {
		assertTrue(CoffeeTouchscreenAdapter.chooseCoffee(2));
	}

	@Test
	public void testSelection3() {
		assertTrue(CoffeeTouchscreenAdapter.chooseCoffee(3));
	}
	
	@Test
	public void testSelection4() {
		assertTrue(CoffeeTouchscreenAdapter.chooseCoffee(4));
	}
	
	@Test
	public void testInvalidSelection() {
		assertFalse(CoffeeTouchscreenAdapter.chooseCoffee(5));
	}
	
	@Test
	public void testNewCoffee1() {
		assertEquals("COOL NEW plain black coffee." , CoffeeTouchscreenAdapter.chooseFirstSelection());
	}
	
	@Test
	public void testNewCoffee2() {
		assertEquals("COOL NEW plain black decaf coffee." , CoffeeTouchscreenAdapter.chooseSecondSelection());
	}
	
	
	@Test
	public void testOldCoffee1() {
		assertEquals("Plain black coffee." , OldCoffeeMachine.selectA());
	}
	
	@Test
	public void testOldCoffee2() {
		assertEquals("Plain black decaf coffee." , OldCoffeeMachine.selectB());
	}
}
