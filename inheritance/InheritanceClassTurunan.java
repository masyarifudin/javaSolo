class One{
	One(String s){
		System.out.println("One .....");
	}
}

class Two extends One{
	Two(String s){
		super(s);
		System.out.println("Two .....");
	}
}

class Three extends Two{
	Three(String s){
		super(s);
		System.out.println("Three .....");
	}
}

public class InheritanceClassTurunan{
	public static void main(String [] args){
		Three tiga = new Three("asd");
	}
}