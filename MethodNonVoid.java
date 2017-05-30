public class MethodNonVoid{
	public static void main(String[] args) {
		int hasilBalik = kali(8,5);
		System.out.println("hasil balikannya adalah "+hasilBalik);
		System.out.println(getKota());
		printArray(getList());

		int hasilBalikLagi= kali(tiga(), duaPuluhLima());
		System.out.println("hasil balikannya adalah "+hasilBalikLagi);
	}
	static int kali(int a, int b){
		int hasil = a*b;
		return hasil;
	}

	static String getKota(){
		return "sukoharjo";
	}

	static String [] getList(){
		String [] lists ={"alpha","beta","gamma"};
		return lists;
	}

	static void printArray(String[] x){
		for (int a = 0;a<x.length ;a++ ) {
			System.out.println("hasil array ke-"+a+" : "+x[a]);
		}
	}

	static int tiga(){
		return 3;
	}

	static int duaPuluhLima(){
		return 25;
	}
}