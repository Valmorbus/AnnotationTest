package jUnitTesterTest;

import static org.junit.Assert.*;
import org.junit.Test;
import jUnitTester.Converter;

// skapas genom  : New : JUnit Test Case 
// Obs, ska ligga i eget paket

public class ConvertTest {

	//junit annotation "@Test"
	@Test
	public void testmilesToKm() {
		//fail("Not yet implemented"); automatgenereras, ska bort så det inte failar
		
		Converter con = new Converter();
		
		// text, vad resultatet borde bli, metod som testas, felmarginal
		assertEquals("2 miles must be 3,22 km", 3.22f, con.milesToKm(2), 0.1f);
		
	}
	@Test(timeout = 10)
	public void conversionShouldBeFast(){
		Converter con = new Converter();
		con.milesToKm(654.54f);
		
	}

}
