

public class Utente extends MerendoLista {

	/**
	 * @uml.property  name="codice"
	 */
	private String codice = null;

	/**
	 * Getter of the property <tt>codice</tt>
	 * @return  Returns the codice.
	 * @uml.property  name="codice"
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * Setter of the property <tt>codice</tt>
	 * @param codice  The codice to set.
	 * @uml.property  name="codice"
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @uml.property  name="credito"
	 */
	private double credito;

	/**
	 * Getter of the property <tt>credito</tt>
	 * @return  Returns the credito.
	 * @uml.property  name="credito"
	 */
	public double getCredito() {
		return credito;
	}

	/**
	 * Setter of the property <tt>credito</tt>
	 * @param credito  The credito to set.
	 * @uml.property  name="credito"
	 */
	public void setCredito(double credito) {
		this.credito = credito;
	}

	/**
	 * @uml.property  name="merendoLista"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="utente:MerendoLista"
	 * @uml.association  name="visiona"
	 */
	private MerendoLista merendoLista = null;

	/**
	 * Getter of the property <tt>merendoLista</tt>
	 * @return  Returns the merendoLista.
	 * @uml.property  name="merendoLista"
	 */
	public MerendoLista getMerendoLista() {
		return merendoLista;
	}

	/**
	 * Setter of the property <tt>merendoLista</tt>
	 * @param merendoLista  The merendoLista to set.
	 * @uml.property  name="merendoLista"
	 */
	public void setMerendoLista(MerendoLista merendoLista) {
		this.merendoLista = merendoLista;
	}

}
