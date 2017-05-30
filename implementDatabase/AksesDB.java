public class AksesDB{
	public static void main(String[] args) {
		Database db = new MicrosoftDriver();
		db.connect();
		db.disconnect();
	}
}