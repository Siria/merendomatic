

import java.util.Collection;

public class ListaProdotti {

	/**
	 * @uml.property  name="prodotto"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="listaProdotti:Prodotto"
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

}
