import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public final class NumerosRomanosBase {

	private Map<Integer, String> tabla;
	public NumerosRomanosBase() {
		tabla = new TreeMap<Integer, String>(Collections.reverseOrder());
		tabla.put(1, "I");
		tabla.put(4, "IV");
		tabla.put(5, "V");
		tabla.put(9, "IX");
		tabla.put(10, "X");
		tabla.put(40, "XL");
		tabla.put(50, "L");
		tabla.put(90, "XC");
		tabla.put(100, "C");
		tabla.put(400, "CD");
		tabla.put(500, "D");
		tabla.put(900, "CM");
		tabla.put(1000, "M");
	}
	
	public String devuelveRomano(int arabe) {
		return tabla.get(arabe);
	}
	
	public Set<Integer> devuelveListaDeArabes() {
		return tabla.keySet();
	}
	
}
