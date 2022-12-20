/**
 * Esta clase implementar� diferentes m�todos que est�n relacionados 
   con la sumas de la calculadora.
   Adem�s la clase contar� con un atributo, donde se guardar� el valor acumulado,
   el cual ser� privado y de tipo double, y le inicializaremos a 0
 * 
 * @author Marta Aparicio
 * @version  
 */

public class Suma {
      private static double valorAcumuladoSuma=0;
      private static double resultado=0;
      private static int resultadoInt=0;
 /**
 * M�todo que calcular� la suma de dos n�meros reales 
 * @param num1 representa el primer numero de tipo double.
 * @param num2 representa el segundo numero de tipo double.
 * @return devuelve el resultado de tipo double, dado de la operaci�n num1+num2
 */
    public static double Suma2Reales(double num1, double num2){
        resultado= num1+num2;
	return resultado;
  } 
/**
 * M�todo que realizar� la suma de dos n�meros de tipo enteros 
 * @param num1 representa el primer numero de tipo entero.
 * @param num2 representa el segundo numero de tipo entero.
 * @return devuelve el resultado de tipo entero, dado de la operaci�n num1+num2
 */
    public static int Suma2Enteros(int num1, int num2){
        resultadoInt= num1+num2;
	return resultadoInt;
  } 
/**
 * M�todo el cual sumar� tres valores numerico de tipo real. 
 * @param num1 representa el primer numero de tipo double.
 * @param num2 representa el segundo numero de tipo double.
 * @param num3 representa el segundo numero de tipo double.
 * @return devuelve el resultado de tipo double, dado de la operaci�n num1+num2+num3
 */
    public static double Suma3Reales(double num1, double num2, double num3){
        resultado= num1+num2+num3;
        return resultado;
    }
 /**
 * Este metodo calcular� el valor acumulado, el cual se guardar� en un atributo
  creado en la clase suma.
 * @param num representa valor numerico a introducir 
 */
    public static void acumulado (double num){
	valorAcumuladoSuma= valorAcumuladoSuma + num;
    }
}