public class EncapsulationClassCetakMobilStatic{
	public static void main(String[] args) {
		EncapsulationClassMobil civic = new EncapsulationClassMobil();
		EncapsulationClassMobil skyline = new EncapsulationClassMobil();
		System.out.println("roda"+civic.roda);
		System.out.println("roda"+skyline.roda);
		System.out.println("===================");
		civic.roda = 9;
		System.out.println("roda"+civic.roda);
		System.out.println("roda"+skyline.roda);
		System.out.println("===================");
		System.out.println("mesin"+civic.mesin);
		System.out.println("mesin"+skyline.mesin);
		System.out.println("===================");
		civic.mesin = 10;
		System.out.println("mesin"+civic.mesin);
		System.out.println("mesin"+skyline.mesin);
		EncapsulationClassMobil.maju();
	}
}