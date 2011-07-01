import java.security.InvalidParameterException;

public class NumerosRomanos {

	private NumerosRomanosBase numerosRomanosBase;
	
	public NumerosRomanos(NumerosRomanosBase numerosRomanosBase) {
		this.numerosRomanosBase = numerosRomanosBase;
	}

	public String arabeARomano(int arabe) {
		
		validarNumeroMenorQue(arabe,3000);
		
		StringBuilder romano = new StringBuilder();
		for (int clave : numerosRomanosBase.devuelveListaDeArabes()) {
			while (arabe >= clave) {
				romano.append(numerosRomanosBase.devuelveRomano(clave));
				arabe -= clave;
			}
		}
		return romano.toString();
	}

	private void validarNumeroMenorQue(int arabe,int valorAComparar) {
		if(arabe > valorAComparar){
			throw new InvalidParameterException("El parametro pasado:" +arabe+" superior a 3000 no es valido");
		}
	}

}
