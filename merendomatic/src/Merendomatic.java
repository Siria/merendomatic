

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
	 * @uml.property name="distributore"
	 * @uml.associationEnd inverse="merendomatic:Distributore"
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

	/**
	 * @uml.property  name="merendoLista1"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="merendomatic1:MerendoLista"
	 */
	private MerendoLista merendoLista1 = null;

	/**
	 * Getter of the property <tt>merendoLista1</tt>
	 * @return  Returns the merendoLista1.
	 * @uml.property  name="merendoLista1"
	 */
	public MerendoLista getMerendoLista1() {
		return merendoLista1;
	}

	/**
	 * Setter of the property <tt>merendoLista1</tt>
	 * @param merendoLista1  The merendoLista1 to set.
	 * @uml.property  name="merendoLista1"
	 */
	public void setMerendoLista1(MerendoLista merendoLista1) {
		this.merendoLista1 = merendoLista1;
	} 
}
