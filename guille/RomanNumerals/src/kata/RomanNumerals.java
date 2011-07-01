package kata;
public class RomanNumerals {
	final static int numeros[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	final static String letras[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C","CD", "D", "CM", "M"};
	public String toRoman(int numeroAConvertir) {
		StringBuilder roman = new StringBuilder();
		for (int i = letras.length-1; i >= 0; i--) 			
			if (numeroAConvertir >= numeros[i]) 
				while (numeroAConvertir >= numeros[i]) {
					roman.append(letras[i]);
					numeroAConvertir -= numeros[i];
				}
		return roman.toString();
	}
}