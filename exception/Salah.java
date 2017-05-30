public class Salah{
	public static void main(String[] args) {
		try{
			int [] bilangan = {10,20,87};
			System.out.println("hasil bilangan adalah :"+bilangan[2]);	
			int hasil = 10/0;
			System.out.println("hasil baginya adalah :"+hasil);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Ada kesalahan di array ");
		}catch(ArithmeticException ex){
			System.out.println("Ada kesalahan di aritmatiknya");
		}catch(Exception ex){
			System.out.println("errornya tidak dikenali");
		}finally{
			System.out.println("finally Exception");
		}
	}
}