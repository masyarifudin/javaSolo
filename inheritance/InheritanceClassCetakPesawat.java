public class InheritanceClassCetakPesawat{
	public static void main(String[] x){
		InheritanceClassPesawat boeing = new InheritanceClassPesawat();
		boeing.terbang();
		boeing.mendarat();
		InheritanceClassPesawatTempur f17 = new InheritanceClassPesawatTempur();
		f17.terbang();
		f17.mendarat();
		f17.manuver();
	}
}