public class InnerClassIntro{
	public static void main(String [] args){
		Luar l = new Luar();
		Luar.Tengah t = l.new Tengah();
		Luar.Tengah.Dalam d = t.new Dalam();

		l.cetakLuar();
	}
}

class Luar{
	void cetakLuar(){
		System.out.println("cetak luar");
	}
	class Tengah{
		void cetakTengah(){
			System.out.println("cetak Tengah");
		}
		class Dalam{
			void cetakDalam(){
				System.out.println("cetak Dalam");
			}
		}
	}
}