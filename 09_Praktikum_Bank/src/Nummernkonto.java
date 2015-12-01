
public class Nummernkonto extends Bankkonto {
	private int nummer;
	private static int counter = 1000;
	public Nummernkonto(String inhaber){
		super(inhaber);
		nummer = counter++;
	}
	public Nummernkonto(String inhaber, int ersteinlage){
		super(inhaber, ersteinlage);
		nummer = counter++;
	}
	
	@Override
	protected String inhaberAusgabe(){
		return String.valueOf(nummer);
	}
//	public String toString(){
//		return "Inhaber: "+this.nummer+", Kontostand: "+getKontostand();
//	}
	
	
}
