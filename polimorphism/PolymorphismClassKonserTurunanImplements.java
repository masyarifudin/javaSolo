public class PolymorphismClassKonserTurunanImplements{
	public static void main(String [] args){
		PolymorphismClassGitarTurunanImplements gitar = new PolymorphismClassGitarTurunanImplements();
		PolymorphismClassPianoTurunanImplements piano = new PolymorphismClassPianoTurunanImplements();

		test(piano);
		test(gitar);
	}

	static void test(PolymorphismClassTurunanAlatMusikImplements x){
		x.play();
		x.stop();
	}
}