

import java.util.Collection;

public class ProfiloUtente {

	/**
	 * @uml.property  name="id"
	 */
	private String id = null;

	/**
	 * Getter of the property <tt>id</tt>
	 * @return  Returns the id.
	 * @uml.property  name="id"
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter of the property <tt>id</tt>
	 * @param id  The id to set.
	 * @uml.property  name="id"
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @uml.property  name="credito"
	 */
	private double credito = 0;

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
	 * @uml.property  name="listaUtenti"
	 * @uml.associationEnd  inverse="profiloUtente:ListaUtenti"
	 * @uml.association  name="buh"
	 */
	private ListaUtenti listaUtenti;

	/**
	 * Getter of the property <tt>listaUtenti</tt>
	 * @return  Returns the listaUtenti.
	 * @uml.property  name="listaUtenti"
	 */
	public ListaUtenti getListaUtenti() {
		return listaUtenti;
	}

	/**
	 * Setter of the property <tt>listaUtenti</tt>
	 * @param listaUtenti  The listaUtenti to set.
	 * @uml.property  name="listaUtenti"
	 */
	public void setListaUtenti(ListaUtenti listaUtenti) {
		this.listaUtenti = listaUtenti;
	}

	/** 
	 * @uml.property name="listaUtenti1"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="profiloUtente1:ListaUtenti"
	 */
	private ListaUtenti listaUtenti1 = null;

	/** 
	 * Getter of the property <tt>listaUtenti1</tt>
	 * @return  Returns the listaUtenti1.
	 * @uml.property  name="listaUtenti1"
	 */
	public ListaUtenti getListaUtenti1() {
		return listaUtenti1;
	}

	/** 
	 * Setter of the property <tt>listaUtenti1</tt>
	 * @param listaUtenti1  The listaUtenti1 to set.
	 * @uml.property  name="listaUtenti1"
	 */
	public void setListaUtenti1(ListaUtenti listaUtenti1) {
		this.listaUtenti1 = listaUtenti1;
	}

}
