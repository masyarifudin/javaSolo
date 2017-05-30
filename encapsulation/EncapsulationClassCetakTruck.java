public class EncapsulationClassCetakTruck{
	public static void main(String[] args) {
		EncapsulationClassTruck hino = new EncapsulationClassTruck(7,8,6);
		EncapsulationClassTruck fuso = new EncapsulationClassTruck(9,4,2);
		EncapsulationClassTruck tronton = new EncapsulationClassTruck();
		System.out.println("roda hino : "+hino.roda);
		System.out.println("mesin hino : "+hino.mesin);
		System.out.println("body hino : "+hino.body);
		System.out.println("roda fuso : "+fuso.roda);
		System.out.println("mesin fuso : "+fuso.mesin);
		System.out.println("body fuso : "+fuso.body);
		System.out.println("roda tronton : "+tronton.roda);
		System.out.println("mesin tronton : "+tronton.mesin);
		System.out.println("body tronton : "+tronton.body);
	}
}