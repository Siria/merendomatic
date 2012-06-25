

public class Merendomatic {
	
	Merendomatic(){
		
	}
		
	public static void main(final String args[]){
		int x =6;
		System.out.println(x);
		System.out.println("Ufffiiiii");
		System.out.println("WOW--- :-)");
		System.out.println("Basta sparare caxxate... cOminciamo a lavorare..");
	}

	/**
	 * @uml.property  name="distributore"
	 * @uml.associationEnd  inverse="merendomatic:Distributore"
	 */
	private Distributore distributore;

	/**
	 * Getter of the property <tt>distributore</tt>
	 * @return  Returns the distributore.
	 * @uml.property  name="distributore"
	 */
	public Distributore getDistributore() {
		return distributore;
	}

	/**
	 * Setter of the property <tt>distributore</tt>
	 * @param distributore  The distributore to set.
	 * @uml.property  name="distributore"
	 */
	public void setDistributore(Distributore distributore) {
		this.distributore = distributore;
	}

	/** 
	 * @uml.property name="merendoLista"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="merendomatic:MerendoLista"
	 * @uml.association name="considera"
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
