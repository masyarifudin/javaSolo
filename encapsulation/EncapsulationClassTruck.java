public class EncapsulationClassTruck{
	public int roda;
	public int mesin;
	public int body;

	/**constructor yang default => tidak perlu parameter*/
	public EncapsulationClassTruck(){
		this(4,1,1);
		System.out.println("truk dibuat ...");
	}

	/**constructor yang non-default => menggunakan parameter * harus */
	public EncapsulationClassTruck(String e){
		System.out.println("truk dibuat ...");
	}

	public EncapsulationClassTruck(int roda, int mesin, int body){
		this.roda = roda;
		this.mesin = mesin;
		this.body = body;
	}

	public void berjalan(){
		System.out.println("truk berjalan ...");
	}
}