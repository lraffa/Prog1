
public class Bank {

	public static void main(String[] args) {
		System.out.println(new Bankkonto("test", 1000000000));
		System.out.println(new Salaerkonto("salaer", -1233000, 1000));
		System.out.println(new Nummernkonto("test", 1000000));
		System.out.println(new Nummernkonto("test", 100));
		Nummernkonto nK = new Nummernkonto("test", 1000);
		nK.abheben(2000);
		nK.einbezahlen(1000);
		System.out.println(nK);
		Salaerkonto sK = new Salaerkonto("test", 1000, 1000);
		sK.abheben(2000);
		sK.einbezahlen(500);
		System.out.println(sK);
		Bankkonto bK = new Bankkonto("test", 1000);
		bK.einbezahlen(100);	
		bK.abheben(100);
		bK.einbezahlen(10000000);
		System.out.println(bK);
		System.out.println(bK.getKontostand());

	}

}
