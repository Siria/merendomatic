

import java.util.Collection;

public class Distributore {

	/**
	 * @uml.property  name="luogo"
	 */
	private String luogo = null;

	/**
	 * Getter of the property <tt>luogo</tt>
	 * @return  Returns the luogo.
	 * @uml.property  name="luogo"
	 */
	public String getLuogo() {
		return luogo;
	}

	/**
	 * Setter of the property <tt>luogo</tt>
	 * @param luogo  The luogo to set.
	 * @uml.property  name="luogo"
	 */
	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	/**
	 * @uml.property  name="idDistributore"
	 */
	private int idDistributore;

	/**
	 * Getter of the property <tt>idDistributore</tt>
	 * @return  Returns the idDistributore.
	 * @uml.property  name="idDistributore"
	 */
	public int getIdDistributore() {
		return idDistributore;
	}

	/**
	 * Setter of the property <tt>idDistributore</tt>
	 * @param idDistributore  The idDistributore to set.
	 * @uml.property  name="idDistributore"
	 */
	public void setIdDistributore(int idDistributore) {
		this.idDistributore = idDistributore;
	}

	/** 
	 * @uml.property name="prodotto"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="composite" inverse="distributore:Prodotto"
	 */
	private Collection prodotto;

	/** 
	 * Getter of the property <tt>prodotto</tt>
	 * @return  Returns the prodotto.
	 * @uml.property  name="prodotto"
	 */
	public Collection getProdotto() {
		return prodotto;
	}

	/** 
	 * Setter of the property <tt>prodotto</tt>
	 * @param prodotto  The prodotto to set.
	 * @uml.property  name="prodotto"
	 */
	public void setProdotto(Collection prodotto) {
		this.prodotto = prodotto;
	}

	/** 
	 * @uml.property name="merendoLista"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="distributore:MerendoLista"
	 * @uml.association name="contiene"
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

	/** 
	 * @uml.property name="merendomatic"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="distributore:Merendomatic"
	 */
	private Merendomatic merendomatic = null;

	/** 
	 * Getter of the property <tt>merendomatic</tt>
	 * @return  Returns the merendomatic.
	 * @uml.property  name="merendomatic"
	 */
	public Merendomatic getMerendomatic() {
		return merendomatic;
	}

	/** 
	 * Setter of the property <tt>merendomatic</tt>
	 * @param merendomatic  The merendomatic to set.
	 * @uml.property  name="merendomatic"
	 */
	public void setMerendomatic(Merendomatic merendomatic) {
		this.merendomatic = merendomatic;
	}

}
