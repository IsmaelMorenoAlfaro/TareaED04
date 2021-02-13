package cuentas;

/**
 * Implementa el inicio del programa.
 * Clase que gestiona la operativa de cuentas bancarias
 * 
 * @author IsmaelMorenoAlfaro
 * @version 2.0
 */
public class Main {

	public static void main(String[] args) {
		operativa_cuenta(200);
	}

	
	/**
	 * Método que realiza la operativa de una cuenta bancaria
	 * 
	 * @param cantidad
	 */
	private static void operativa_cuenta(float cantidad) {
		
		CCuenta cuenta1;
		double saldoActual;

		//declarición e inicialización de un objeto de la clase CCuenta
		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		
		//guarda el saldo actual y lo muestra por pantalla
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es " + saldoActual);

		//intenta retirar saldo y si ocurre una excepción muestra un mensaje
		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		
		//intenta ingresar saldo y si ocurre una excepción muestra un mensaje
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
