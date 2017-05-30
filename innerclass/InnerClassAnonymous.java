public class InnerClassAnonymous{
	public static void main(String[] args) {
		/** memanggil class InnerAnonymous */
		InnerAnonymous i = new InnerAnonymous();
		/** memanggil interface dosen yang diimplementasi ke dalam InnerAnonymous / i */
		Dosen d = i.getDosen();
		d.mengajar();
	}
}
interface Dosen {
	void mengajar();
	void makan();
}
class InnerAnonymous{
	Dosen getDosen(){
		/** membuat objek dari sebuah class tanpa nama yang mengimplement interface dosen*/
		return new Dosen()
		{
			public void mengajar(){
				System.out.println("Mangajar");
			}
			public void makan(){
				System.out.println("Makan");
			}
		};
	}
}