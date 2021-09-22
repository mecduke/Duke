package CoinCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoinTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConstructor()
	{
		Coin coin1 = new Coin("testType", 1902, "mint", 22.22);
		assertEquals("mint", coin1.getCondition());
		assertEquals("testType", coin1.getType());
		assertEquals(22.22, coin1.getValue(), 0.5);
		assertEquals(1902, coin1.getYear());
	}

	@Test
	public void testSetValue()
	{
		Coin coin1 = new Coin("test", 1999, "fair", 22.22);
		coin1.setValue(45.67);
		assertEquals(45.67, coin1.getValue(), 0.5);
	}

	@Test
	public void testToString()
	{
		Coin coin1 = new Coin("test", 1998, "fair", 12.34);
		assertEquals("Type : test\nYear : 1998\nCondition : fair\nValue : 12.34\n", coin1.toString());
	}

}
