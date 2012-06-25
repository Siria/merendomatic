

import java.util.Collection;

public class MerendoLista {

	/**
	 * @uml.property  name="utente"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="merendoLista:Utente"
	 * @uml.association  name="visiona"
	 */
	private Collection utente;

	/**
	 * Getter of the property <tt>utente</tt>
	 * @return  Returns the utente.
	 * @uml.property  name="utente"
	 */
	public Collection getUtente() {
		return utente;
	}

	/**
	 * Setter of the property <tt>utente</tt>
	 * @param utente  The utente to set.
	 * @uml.property  name="utente"
	 */
	public void setUtente(Collection utente) {
		this.utente = utente;
	}

	/**
	 * @uml.property  name="distributore"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="merendoLista:Distributore"
	 * @uml.association  name="contiene"
	 */
	private Collection distributore;

	/**
	 * Getter of the property <tt>distributore</tt>
	 * @return  Returns the distributore.
	 * @uml.property  name="distributore"
	 */
	public Collection getDistributore() {
		return distributore;
	}

	/**
	 * Setter of the property <tt>distributore</tt>
	 * @param distributore  The distributore to set.
	 * @uml.property  name="distributore"
	 */
	public void setDistributore(Collection distributore) {
		this.distributore = distributore;
	}

}
