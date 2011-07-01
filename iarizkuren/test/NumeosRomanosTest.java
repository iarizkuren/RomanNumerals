
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.security.InvalidParameterException;

import org.junit.BeforeClass;
import org.junit.Test;

public class NumeosRomanosTest {

	public static NumerosRomanos nr;
	
	@BeforeClass
	public static void setUp() {
		nr = new NumerosRomanos(new NumerosRomanosBase());
	}
	
	@Test
	public void cuando_le_pasas_uno_deberia_devolver_I(){
		assertThat(nr.arabeARomano(1), is("I"));
	}
	
	@Test
	public void cuando_le_pasas_5_deberia_devolver_V(){
		assertThat(nr.arabeARomano(5), is("V"));
	}
	
	@Test
	public void cuando_le_pasas_7_deberia_devolver_VII(){
		assertEquals("VII",nr.arabeARomano(7));
	}
	
	@Test
	public void cuando_le_pasas_10_deberia_devolver_X(){
		assertEquals("X", nr.arabeARomano(10));
	}
	
	@Test
	public void cuando_le_pasas_9_deberia_devolver_IX(){
		assertEquals("IX",nr.arabeARomano(9));
	}
	
	
	@Test
	public void cuando_le_pasas_11_deberia_devolver_XI(){
		assertEquals("XI",nr.arabeARomano(11));
	}
	
	@Test
	public void cuando_le_pasas_40_deberia_devolver_XL() {
		assertEquals("XXXIX",nr.arabeARomano(39));
		assertEquals("XL",nr.arabeARomano(40));
	}
	
	@Test
	public void restoDeNumerosBasicosRomanos () {
		assertEquals("L",nr.arabeARomano(50));
		assertEquals("XC",nr.arabeARomano(90));
		assertEquals("C",nr.arabeARomano(100));
		assertEquals("CD",nr.arabeARomano(400));
		assertEquals("D",nr.arabeARomano(500));
		assertEquals("CM",nr.arabeARomano(900));
		assertEquals("M",nr.arabeARomano(1000));
	}
	
	
	@Test(expected = InvalidParameterException.class) 
	public void no_admite_numeros_mayores_de_tresmil() {
		nr.arabeARomano(3001);
	}
	
	@Test
	public void testAceptacion() {
		assertThat(nr.arabeARomano(1990), is("MCMXC"));
	}


}
