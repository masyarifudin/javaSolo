public class InheritanceClassPesawatTempur extends InheritanceClassPesawat {
	InheritanceClassPesawatTempur(){
		System.out.println("Pesawat Tempur baru");
	}
	void manuver(){
		System.out.println("manuver ......");
	}
	void terbang(){
		super.terbang();
		System.out.println("terbang lagi ......");
	}
}