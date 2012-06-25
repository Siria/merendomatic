

import java.util.Collection;

public class Prodotto {

	/**
	 * @uml.property  name="prezzo"
	 */
	private double prezzo;

	/**
	 * Getter of the property <tt>prezzo</tt>
	 * @return  Returns the prezzo.
	 * @uml.property  name="prezzo"
	 */
	public double getPrezzo() {
		return prezzo;
	}

	/**
	 * Setter of the property <tt>prezzo</tt>
	 * @param prezzo  The prezzo to set.
	 * @uml.property  name="prezzo"
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	/**
	 * @uml.property  name="nome"
	 */
	private String nome = null;

	/**
	 * Getter of the property <tt>nome</tt>
	 * @return  Returns the nome.
	 * @uml.property  name="nome"
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Setter of the property <tt>nome</tt>
	 * @param nome  The nome to set.
	 * @uml.property  name="nome"
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

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
	 * @uml.property name="distributore"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="prodotto:Distributore"
	 * @uml.association name="xx"
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

	/**
	 * @uml.property  name="utente"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="prodotto:Utente"
	 * @uml.association  name="acquista"
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
	 * @uml.property  name="listaProdotti"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="prodotto:ListaProdotti"
	 */
	/**
	 * Getter of the property <tt>listaProdotti</tt>
	 * @return  Returns the listaProdotti.
	 * @uml.property  name="listaProdotti"
	 */

	/**
	 * Setter of the property <tt>listaProdotti</tt>
	 * @param listaProdotti  The listaProdotti to set.
	 * @uml.property  name="listaProdotti"
	 */


}
