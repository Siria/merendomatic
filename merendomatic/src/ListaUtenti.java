

import java.util.Collection;

public class ListaUtenti {

	/**
	 * @uml.property  name="profiloUtente"
	 * @uml.associationEnd  inverse="listaUtenti:ProfiloUtente"
	 * @uml.association  name="buh"
	 */
	private ProfiloUtente profiloUtente;

	/**
	 * Getter of the property <tt>profiloUtente</tt>
	 * @return  Returns the profiloUtente.
	 * @uml.property  name="profiloUtente"
	 */
	public ProfiloUtente getProfiloUtente() {
		return profiloUtente;
	}

	/**
	 * Setter of the property <tt>profiloUtente</tt>
	 * @param profiloUtente  The profiloUtente to set.
	 * @uml.property  name="profiloUtente"
	 */
	public void setProfiloUtente(ProfiloUtente profiloUtente) {
		this.profiloUtente = profiloUtente;
	}

	/** 
	 * @uml.property name="profiloUtente1"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="listaUtenti1:ProfiloUtente"
	 */
	private Collection profiloUtente1;

	/** 
	 * Getter of the property <tt>profiloUtente1</tt>
	 * @return  Returns the profiloUtente1.
	 * @uml.property  name="profiloUtente1"
	 */
	public Collection getProfiloUtente1() {
		return profiloUtente1;
	}

	/** 
	 * Setter of the property <tt>profiloUtente1</tt>
	 * @param profiloUtente1  The profiloUtente1 to set.
	 * @uml.property  name="profiloUtente1"
	 */
	public void setProfiloUtente1(Collection profiloUtente1) {
		this.profiloUtente1 = profiloUtente1;
	}

}
