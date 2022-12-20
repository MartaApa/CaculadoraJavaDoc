 /**
 * Aquí se implementará el main de nuestra calculadora
 * @author  Marta Aparicio && Daniel Jiménez && Jorge García
 *
 */

public class Calculadora {

	public static void main(String[] args) {
		
		//Variables necesarias para realizar las operaciones
				double num1=3.3;
				double num2=2.4;
				double num3=1.5;
				double base= 2.1;
				double exponente = 3.4;
				int num4=8;
				int num5=4;
		
		//Posible main para probar los métodos de la suma 
		  System.out.println(Suma.Suma2Reales(num1,num2));
	      System.out.println(Suma.Suma2Enteros(num4,num5));
	      System.out.println(Suma.Suma3Reales(num1,num2,num3));
	      System.out.println(Suma.valorAcumuladoSuma);
		
	

	}
}
