public class PolymorphismClassKonser{
	public static void main(String[] args){
		PolymorphismClassGitar gitar = new PolymorphismClassGitar();
		PolymorphismClassPiano piano = new PolymorphismClassPiano();

		test(piano);
		test(gitar);
	}
	/** pemanggilan class harus sama dengan yang ada 
		dibuat static karena public static hanya bisa memanggil method yang static juga		
		void tidak mendapatkan nilai balik
	*/
	static void test(PolymorphismClassGitar x){
		x.play();
		x.stop();
	}

	/** pemanggilan class harus sama dengan yang ada 
		dibuat static karena public static hanya bisa memanggil method yang static juga
	*/
	static void test(PolymorphismClassPiano x){
		x.play();
		x.stop();
	}
}