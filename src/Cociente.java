/**
 * Clase que se encarga de la divisi�n de n�meros enteros y reales, calcula ra�ces e inversos de un n�mero.
 * 
 * @author  Marta Aparicio && Daniel Jim�nez && Jorge Garc�a
 * @version 1.0
 * 
 */
public class Cociente {
	
	private static double resultado=0;
	
	/**
	 * M�todo que calcula la divisi�n de dos n�meros reales. Devuelve otro n�mero real con la soluci�n.
	 * @param numerador representa el n�mero real que se utiliza de numerador en la divisi�n.
	 * @param denominador representa el n�mero real que se utiliza de denominador en la divisi�n.
	 * @return devuelve un n�mero real con el resultado de la divisi�n del numerador/denominador. 
	 * @throws java.lang.ArithmeticException Si el denominador es cero el m�todo dar� error y lanzar� una excepci�n.
	 */
	public static double divisionDosReales (double numerador, double denominador) {
		resultado=numerador/denominador;
		return resultado;
	}
	
	/**
	 * M�todo que calcula la divisi�n de dos n�meros enteros. Devuelve un n�mero real con la soluci�n para evitar desbordamientos.
	 * @param num1 representa el n�mero real que se utiliza de numerador en la divisi�n.
	 * @param denom1 representa el n�mero real que se utiliza de denominador en la divisi�n, no puede ser cero.
	 * @return devuelve un n�mero real con el resultado de la divisi�n del num1/denom1. Se almacenar� el resultado en un double, por tanto
	 * se soportan resultados con n�meros no exactos.
	 * @throws java.lang.ArithmeticException Si el denominador es cero el m�todo dar� error y lanzar� una excepci�n.
	 */
	public static double divisionDosEnteros (int num1, int denom1) {
		resultado=num1/denom1;
		return resultado ;
	}
	
	/**
	 * M�todo que calcula la ra�z de un n�mero.
	 * @param numero representa el n�mero real sobre el que se calcula el inverso, no puede ser cero.
	 * @return devuelve un n�mero real con el inverso de numero (1/numero). 
	 * @throws java.lang.ArithmeticException Si el numero es cero el m�todo dar� error y lanzar� una excepci�n.
	 */
	public static double inverso (double numero) {
		resultado=1/numero;
		return resultado ;
	}
	
	/**
	 * M�todo que calcula la ra�z de un n�mero.
	 * @param numero representa el n�mero real sobre el que se calcula la ra�z, no puede ser negativo.
	 * @return devuelve un n�mero real con el resultado de la ra�z. El resultado podr�a dar error en caso de que la calculadora admitiera n�meros negativos.
	 * @throws java.lang.ArithmeticException Si calculadora admite n�meros negativos, dar� un error al ejecutar y se lanzar� una excepci�n.
	 */
	public static double raiz (double numero) {
		resultado=Math.sqrt(numero);
		return resultado ;
	}
}