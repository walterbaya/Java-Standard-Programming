
public class Client {
/** Ejercicio #2
	Construir una clase llamada Cliente que tenga como atributos �raz�n social� y �direcci�n�. Respetar el encapsulamiento

	Redefinir el m�todo toString() para que retorne la raz�n social y la direcci�n

	Construir una clase llamada ImpresorDeClientes

	El c�digo a desarrollar estar� dentro del m�todo main de esta clase

	Instanciar 5 clientes y agregarlos a un ArrayList denominado losClientes

	Utilizar un iterador para recorrer losClientes e imprimir los datos de cada uno en pantalla
 */
	private String socialReason;
	private String address;
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return this.address;
	}
	public void setSocialReason(String socialReason) {
		this.socialReason=socialReason;
	}
	public String getSocialReason() {
		return this.socialReason;
	}
	
	
}
