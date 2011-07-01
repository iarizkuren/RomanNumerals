package kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class RomanNumeralsTests {

	static RomanNumerals rn;
	
	@BeforeClass
	public static void setUp() {
		rn = new RomanNumerals();
	}
	
	@Test
	public void uno_devuelve_I() {
		assertThat(rn.toRoman(1), is("I"));
	}
	
	
	@Test
	public void dos_devuelve_II(){
		assertThat(rn.toRoman(2), is("II"));
	}
	
	
	@Test
	public void tres_devuelve_III() {
		assertThat(rn.toRoman(3), is("III"));
	}
	
	@Test
	public void cuatro_devuelve_IV() {
		assertThat(rn.toRoman(4), is("IV"));
	}
	
	@Test
	public void cinco_devuelve_V() {
		assertThat(rn.toRoman(5), is("V"));
	}
	
	@Test
	public void seis_devuelve_VI() {
		assertThat(rn.toRoman(6), is("VI"));
	}
	
	@Test
	public void siete_devuelve_VII() {
		assertThat(rn.toRoman(7), is("VII"));
	}
	
	@Test
	public void ocho_devuelve_VIII() {
		assertThat(rn.toRoman(8), is("VIII"));
	}
	
	@Test
	public void nueve_devuelve_IX() {
		assertThat(rn.toRoman(9), is("IX"));
	}
	
	@Test
	public void diez_devuelve_X() {
		assertThat(rn.toRoman(10), is("X"));
	}
	

	@Test
	public void cuarentaycuatro_devuelve_XLIV() {
		assertThat(rn.toRoman(44), is("XLIV"));
	}
	
	@Test
	public void noventaynueve_devuelve_XCIX() {
		assertThat(rn.toRoman(99), is("XCIX"));
	}
	
	@Test
	public void cientoventitres_devuelve_CXXIII() {
		assertThat(rn.toRoman(123), is("CXXIII"));
	}
	
	@Test
	public void doscientosochentaynueve_devuelve_CCLXXXIX() {
		assertThat(rn.toRoman(289), is("CCLXXXIX"));
	}
	
	@Test
	public void final_devuelve_MCMXC() {
		assertThat(rn.toRoman(1990), is("MCMXC"));
	}
	
}
