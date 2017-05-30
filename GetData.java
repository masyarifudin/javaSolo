import java.util.*;
public class GetData{
	public static void main(String[] args) {
		Scanner penangkap = new Scanner(System.in);

		System.out.print("nama 		: ");
		String nama = penangkap.nextLine();
		System.out.print("alamat 		: ");
		String alamat = penangkap.nextLine();
		System.out.print("umur 		: ");
		String umur = penangkap.nextLine();

		System.out.println("=========== Data =============");
		System.out.println("Nama anda 	:"+nama);
		System.out.println("Alamat anda 	:"+alamat);
		System.out.println("umur anda 	:"+umur);
	}
}