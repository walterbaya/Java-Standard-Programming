
public class Client {
/** Ejercicio #2
	Construir una clase llamada Cliente que tenga como atributos “razón social” y “dirección”. Respetar el encapsulamiento

	Redefinir el método toString() para que retorne la razón social y la dirección

	Construir una clase llamada ImpresorDeClientes

	El código a desarrollar estará dentro del método main de esta clase

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
