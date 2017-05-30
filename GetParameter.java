public class GetParameter{
	public static void main(String[] args) {
		int panjangElement = args.length;

		if (panjangElement == 0){
			System.out.println("anda tidak memasukkan parameter");
		} else {
			for (int b=0 ;b < panjangElement ;b++ ) {
				System.out.println(args[b]);
			}
		}
	}
}