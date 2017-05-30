public class Bank{
	public static void main(String[] args) {
		Tabungan bni = new Tabungan();
		System.out.println("Tabungan awal anda : "+bni.getSaldo());
		bni.setSaldo(10);
		System.out.println("Tabungan perubahan anda : "+bni.getSaldo());
	}
}