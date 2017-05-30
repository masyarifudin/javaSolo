public class PolymorphismClassKonserTurunan{
	public static void main(String [] args){
		PolymorphismClassGitarTurunan gitar = new PolymorphismClassGitarTurunan();
		PolymorphismClassPianoTurunan piano = new PolymorphismClassPianoTurunan();

		test(piano);
		test(gitar);
	}

	static void test(PolymorphismClassTurunanAlatMusik x){
		x.play();
		x.stop();
	}
}