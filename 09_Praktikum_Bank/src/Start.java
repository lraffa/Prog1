
public class Start {

	public static void main(String[] args) {
		System.out.println(new Bankkonto("test", -1000000));
		System.out.println(new Salaerkonto("test", -999.95, 1000));
		System.out.println(new Nummernkonto("test", 100));
		System.out.println(new Nummernkonto("test", 100));
		Salaerkonto x = new Salaerkonto("test",-900, 1000);
		x.einbezahlen(100);	
		x.abheben(100);
		x.einbezahlen(1000);
		System.out.println(x);
		System.out.println(x.getKontostand());

	}

}
