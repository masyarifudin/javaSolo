public class Tabungan{
	private int saldo = 1000;

	public void setSaldo(int uang){
		if(uang == 0){
			System.out.println("perubahan tidak valid");
		} else {
			saldo = uang;
		}
	}

	public int getSaldo(){
		return saldo;
	}
}