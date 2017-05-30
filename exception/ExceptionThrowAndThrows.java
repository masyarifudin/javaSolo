class Kalkulator{
	void bagi(int penyebut, int pembilang) throws Exception{
		if(pembilang == 0){
			throw new Exception("pembilang anda salah");
		} else {
			int hasil = penyebut/ pembilang;
			System.out.println("Hasilnya adalah : "+hasil);
		}
	}
}

public class ExceptionThrowAndThrows{
	public static void main(String[] args) {
		try{
			Kalkulator sony = new Kalkulator();
			sony.bagi(10,0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}