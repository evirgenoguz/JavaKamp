package gun2Odev1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kayit kayit1 = new Kayit();
		
		Odev odev1 = new Odev(1, "Biþiler yapýcan kardeþim");
		Odev[] odevler = {odev1};
		
		
		String[] konular = {"Konu1", "Konu2"};
		DersProgrami dersProgrami1 = new DersProgrami(konular);
		
		Gun gun1 = new Gun(dersProgrami1, kayit1, odevler);
		
	}

}
