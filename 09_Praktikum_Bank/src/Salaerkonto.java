
public class Salaerkonto extends Bankkonto{
	protected int bezugslimite;
	final int LIMIT = 1000000;
	
	public Salaerkonto(String inhaber){
		super(inhaber);
	}
	public Salaerkonto(String inhaber, double ersteinlage){
		super(inhaber, ersteinlage);
	}
	public Salaerkonto(String inhaber, double ersteinlage, double bezugslimite){
		super(inhaber);
		setBezugslimite(bezugslimite);
		einbezahlen(ersteinlage);
	}
	public void setBezugslimite(double bezugslimite){
		int rappenLimite = toRappen(bezugslimite);
		if(rappenLimite >LIMIT){
			this.bezugslimite= LIMIT;
		}
		else if(rappenLimite <0){
			this.bezugslimite=0;
		}
		else{
		this.bezugslimite = rappenLimite;
		}
	}
	@Override
	protected int erlaubtesMinimum(){
		return bezugslimite * -1;
	}
	public String toString(){
		return super.toString() + ", Ueberzugslimite: "+ toFranken(bezugslimite);
	}
	
}
