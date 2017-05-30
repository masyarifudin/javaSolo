public class PercabanganSwitch{
	public static void main(String[] args) {
		char nilai = 'b';
		String predikat;

		switch(nilai){
			case 'a' :
				predikat = "excellent";
				break;
			case 'b' :
				predikat = "good";
				break;
			case 'c' :
				predikat = "fail";
				break;
			case 'd' :
				predikat = "dafuq";
				break;
			case 'e' :
				predikat = "failed";
				break;
			default :
				predikat = "masukkan anda salah";
				break;
		}

		System.out.println(predikat);
	}
}