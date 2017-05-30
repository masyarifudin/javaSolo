public class PercabanganIf{
	public static void main(String[] args) {
		char nilai = 'b';
		String predikat;

		if (nilai == 'a') {
			predikat = "excellent";
		} else if(nilai == 'b'){
			predikat = "good";
		} else if(nilai == 'c'){
			predikat = "fail";
		} else if(nilai == 'd'){
			predikat = "dafuq";
		} else if(nilai == 'e'){
			predikat = "failed";
		} else{
			predikat = "salah nilai";
		}

		System.out.println(predikat);
	}
}