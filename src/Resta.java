/**
	 * Esta clase implementar� todos los m�todos que est�n relacionados 
	 * con la resta de la calculadora.
	 * Adem�s la clase contar� con un atributo, donde se guardar� el valor acumulado,
	 * el cual ser� privado y de tipo double, y le inicializaremos a 0
	 *
	 * @author Marta Aparicio && Daniel Jim�nez && Jorge Garc�a
	 * @version 1.0
	 */

public class Resta {
	
	private static int resultadoInt=0;
	private static double resultado=0;
	public static double valorAcumuladoResta=0;
	
	/**
	 * M�todo que realiza la operaci�n de restar dos n�meros reales.
	 * @param num1 representa el primer numero de tipo double
	 * @param num2 representa el segundo numero de tipo double
	 * @return devuelve el resultado de la operaci�n num1-num2, y ser� de tipo double.
	 */
	public static double Resta2Reales(double num1, double num2) {
		resultado=num1-num2;
		return resultado;
	}
	
	/**
	 * M�todo que calcula el resultado de restar dos n�meros enteros
	 * @param num1 representa el primer numero de tipo entero.
	 * @param num2 representa el segundo numero de tipo entero.
	 * @return devuelve el resultado de la operaci�n num1-num2, y ser� de tipo entero
	 */
	public static int Resta2Enteros(int num1, int num2) {
		resultadoInt=num1-num2;
		return resultadoInt;
	}

	/**
	 * M�todo que devuelve la resta de 3 n�meros reales
	 * @param num1 primer n�mero para realizar la resta
	 * @param num2 n�mero que se restar� a num1
	 * @param num3 n�mero que se restar� al resultado de la resta de num1 menos num2
	 * @return devuelve el resultado de la operaci�n num1-num2-num3, y ser� de tipo double
	 */
	public static double Resta3Reales(double num1, double num2, double num3) {
		resultado=num1-num2-num3;
		return resultado;
	}

	/**
	 * Este metodo calcular� el valor acumulado, el cual se guardar� en un atributo
	  creado en la clase resta.
	 * @param num representa valor numerico a acumular
	 */
	public static void RestaAcumulada(double num) {
		valorAcumuladoResta=valorAcumuladoResta - num;
	}
}
