package gun2Odev1;

import java.sql.Date;

public class Gun {
	DersProgrami dersProgrami;
	Kayit kayit;
	Odev[] odevler;
	
	public Gun(DersProgrami dersProgrami, Kayit kayit, Odev[] odevler) {
		this.dersProgrami = dersProgrami;
		this.kayit = kayit;
		this.odevler = odevler;
		System.out.println("Gun Oluþturuldu");
	}
	
}
