public class PerbandinganString{
	public static void main(String[] args) {
		String kota = "Solo Baru Yang Indah";
		String kata1 = "Solo Baru";
		String kata2 = " Yang Indah";
		String gabungan = kata1+kata2;

		System.out.println(kota);
		System.out.println(gabungan);

		if(kota == gabungan){
			System.out.println("sama");
		} else {
			System.out.println("tidak sama");
		} // perbandingan yang salah karena mengunakan tanda  ==

		if(kota.equals(gabungan)){
			System.out.println("sama");
		} else {
			System.out.println("tidak sama");
		} // perbandingan dengan hasil yang benar
	}
}