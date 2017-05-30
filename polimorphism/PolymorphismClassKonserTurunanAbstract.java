public class PolymorphismClassKonserTurunanAbstract{
	public static void main(String [] args){
		PolymorphismClassGitarTurunanAbstract gitar = new PolymorphismClassGitarTurunanAbstract();
		PolymorphismClassPianoTurunanAbstract piano = new PolymorphismClassPianoTurunanAbstract();

		test(piano);
		test(gitar);
	}

	static void test(PolymorphismClassTurunanAlatMusikAbstract x){
		x.play();
		x.stop();
		x.dijual();
	}
}