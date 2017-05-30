public class CombineAbstractAndImplemantsCetakUjian{
	public static void main(String[] args) {
		CombineAbstractAndImplemantsAmir Amir = new CombineAbstractAndImplemantsAmir();
		ujianGuru(Amir);
		ujianSniper(Amir);
		ujianManusia(Amir);
	}

	static void ujianGuru(CombineAbstractAndImplemantsGuru x){
		x.mengajar();
	}
	static void ujianSniper(CombineAbstractAndImplemantsSniper x){
		x.menembak();
	}
	static void ujianManusia(CombineAbstractAndImplemantsManusia x){
		x.makan();
	}
}