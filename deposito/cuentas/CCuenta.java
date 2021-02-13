package cuentas;

/**
 * Clase que contiene los métodos necesarios para la gestión de una cuenta bancaria
 * 
 * @author IsmaelMorenoAlfaro
 * @version 2.0
 */
public class CCuenta {

	/**
	 * Variables de clase de CCuenta
	 */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Constructor por defecto
	 */
	public CCuenta() {
	}

	/**
	 * Constructor que inicializa los atributos de clase de CCuenta
	 * @param nom - Nombre del cliente
	 * @param cue - Número de cuenta
	 * @param sal - Saldo de la cuenta
	 * @param tipo - Tipo de interés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Método para consultar el estado de la cuenta
	 * 
	 * @return El saldo que hay en la cuenta
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Método para ingresar dinero
	 * 
	 * @param cantidad - Cantidad que se añade al saldo
	 * @throws Exception Error al ingresar saldo
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Método para retirar dinero
	 * 
	 * @param cantidad - Cantidad que se resta al saldo
	 * @throws Exception - Error al retirar saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Método para obtener el nombre del cliente
	 * 
	 * @return El nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer el nombre del cliente
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el número de cuenta
	 * 
	 * @return El número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para establecer el número de cuenta
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para obtener el saldo de la cuenta
	 * 
	 * @return El saldo que tiene la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método para establecer el saldo de la cuenta
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para obtener el tipo de interés de la cuenta
	 * 
	 * @return El tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método para establecer el tipo de interés de la cuenta
	 * 
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
