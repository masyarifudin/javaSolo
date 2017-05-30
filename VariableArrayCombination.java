public class VariableArrayCombination{
	public static void main(String[] args) {
		int [] nilaiMath = {90,75,80,54}; //deklarasi variabel array nilai Math langsung

		int [] nilaiEng;
		nilaiEng = new int[]{78,65,85,35}; //deklarasi variabel array nilai Eng tidak langsung dan nilainya tidak dibatasi

		int [] nilaiScience = new int[3]; //deklarasi variabel array nilai Science tidak langsung dan nilainya dibatasi
		nilaiScience[0]=78;
		nilaiScience[1]=86;
		nilaiScience[2]=75;

		for (int x = 0; x<nilaiScience.length ;x++ ) {
			System.out.println("Science Score ["+x+"] : "+nilaiScience[x]);
		}
	}
}