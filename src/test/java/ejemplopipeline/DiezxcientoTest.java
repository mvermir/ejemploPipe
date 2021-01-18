package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(2400000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		
		Diezxciento diezxciento = new Diezxciento();
		assertEquals(0, diezxciento.impuesto());
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		
		Diezxciento diezxciento = new Diezxciento(24000000,900000);
		assertEquals(2160000, diezxciento.saldoAhorro());

	}

}

