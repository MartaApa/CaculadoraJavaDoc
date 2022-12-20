/**
	 * Esta clase implementar� todos los m�todos que est�n relacionados 
	 * con el producto y c�clulo de la potencia de un n�mero.
	 *
	 * @author Marta Aparicio && Daniel Jim�nez && Jorge Garc�a
	 * @version 1.0
	 */

public class Producto {
	
	/**
	 * Metodo que calcula el producto de dos n�meros reales. Devuelve otro n�mero real con la soluci�n.
	 * @param num1 representa el primer n�mero real que se utiliza para calcular el producto.
	 * @param num2 representa el segundo n�mero real que se utiliza para calcular el producto.
	 * @return devuelve un n�mero real con el resultado del producto de num1xnum2.
	 */
	public double Producto2Reales(double num1, double num2) {
		double resultado = 0;
		
		resultado = num1 * num2;
		return resultado;
	}
	
	/**
	 * M�todo que calcula el producto de dos n�meros reales. Devuelve otro n�mero entero con la soluci�n.
	 * @param num1 representa el primer n�mero entero que se utiliza para calcular el producto.
	 * @param num2 representa el segundo n�mero entero que se utiliza para calcular el producto.
	 * @return devuelve un n�mero entero con el resultado del producto de num1xnum2.
	 */
	public int Producto2Enteros(int num1, int num2) {
		int resultado = 0;
		
		resultado = num1 * num2;
		return resultado;
	}

	/**
	 * M�todo que calcula el producto de tres n�meros reales. Devuelve otro n�mero real con la soluci�n.
	 * @param num1 representa el primer n�mero real que se utiliza para calcular el producto.
	 * @param num2 representa el segundo n�mero real que se utiliza para calcular el producto.
	 * @param num3 representa el tercer n�mero real que se ultiliza para calcular el producto.
	 * @return devuelve un n�mero real con el resultado del producto de num1xnum2xnum3.
	 * @throws java.lang.ArithmeticException Si son n�meros muy grandes, dar� error el programa y lanzar� una excepci�n.
	 */
	public double Producto3Reales(double num1, double num2, double num3) {
		double resultado = 0 ;
		
		resultado = num1 * num2 * num3;
		return resultado;
	}

	/**
	 * M�todo que calcula la potencia de un n�mero. Devuelve un n�mero real con el resultado de la potencia.
	 * @param base representa el n�mero base sobre el que se va a calcular la potencia.
	 * @param exponente representa el exponente al que se va a elevar la base para obtener la potencia.
	 * @return devuelve un n�mero real con el resultado de la potencia (base^exponente).  
	 * @throws java.lang.ArithmeticException Si base y exponente son n�meros muy grandes, dar� error el programa y lanzar� una excepci�n . 
	 */
	public double Potencia(double base, double exponente) {
		double resultado= 0 ;
		resultado = Math.pow(base, exponente);
		return resultado;
	}
}
