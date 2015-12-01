
public class Bankkonto {
	protected String inhaber;
	protected int kontostand;
	private final int LIMIT = 10000000;
	private final int MINIMUM = 0;
	public Bankkonto(String inhaber){
		this.inhaber = inhaber;
	}
	public Bankkonto(String inhaber, double ersteinlage){
		this.inhaber = inhaber;
		einbezahlen(ersteinlage);
	}
	public void einbezahlen(double betrag){		
		aendern(toRappen(betrag));
	}
	public void abheben(double betrag){
		aendern(toRappen(betrag * -1d));
	}
	private void aendern(int betrag){
		if(this.kontostand + betrag > LIMIT) {
			this.kontostand = LIMIT;
		}
		else if (this.kontostand + betrag < erlaubtesMinimum()) {
			this.kontostand = erlaubtesMinimum();
		}
		else {
			this.kontostand += betrag;
		}
	}	
	protected int erlaubtesMinimum() {
		return MINIMUM;
	}
	protected String inhaberAusgabe(){
		return inhaber;
	}
	public double getKontostand(){
		return toFranken(this.kontostand);
	}
	public String toString(){
		return "Inhaber: "+this.inhaberAusgabe()+", Kontostand: "+getKontostand();
	}
	protected double toFranken(int rappen) {
		return rappen / 100d;
	}
	protected int toRappen(double franken) {
		return (int) (franken * 100);
	}
}
