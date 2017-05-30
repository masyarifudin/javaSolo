public class MethodIntro{
	
	public static void main(String[] args) {
		String [] kota = {"solo", "klaten", "jakarta", "sukoharjo"};
		printArray(kota);
		int [] nilai = {10,11,26,90,57,98};
		printArray(nilai);
		String [] name = {"saya", "kamu", "anda", "mereka"};
		printArray(name);
		printArray("aSAS", nilai);
	}

	static void printArray(String[] x){
		for (int a = 0;a<x.length ;a++ ) {
			System.out.println("hasil array ke-"+a+" : "+x[a]);
		}
	}

	static void printArray(int[] x){
		for (int a = 0;a<x.length ;a++ ) {
			System.out.println("hasil array ke-"+a+" : "+x[a]);
		}
	}

	static void printArray(String  keterangan, int[] x){
		System.out.println("============="+keterangan+"============");
		for (int a = 0;a<x.length ;a++ ) {
			System.out.println("hasil array ke-"+a+" : "+x[a]);
		}
	}
	
}