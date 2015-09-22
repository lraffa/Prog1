
/**
 * Write a description of class Konto here.
 * 
 * @author (raffaluc, wernlmax) 
 * @version (22.09.2015)
 */
public class Konto
{
    private String kontoinhaber;
    private int kontostand;
    private int zinssatz;

    /**
     * Erzeugt eine Instanz mit dem Kontoinhaber
     */
    public Konto(String kontoinhaber)
    {
        this.kontoinhaber = kontoinhaber;
        kontostand = 0;
        zinssatz = 2;
    }
    
    /**
     * Erzeugt eine Instanz mit dem Kontoinhaber und dem Zinssatz
     */
    public Konto(String kontoinhaber, int zinssatz)
    {
        this.kontoinhaber = kontoinhaber;
        this.zinssatz = zinssatz;
        kontostand = 0;
    }
    
    /**
     * Gibt den Zinssatz zurück
     */
    public int getZinssatz()
    {
        return zinssatz;
    }
    
    /**
     * Setzt den Zinssatz auf den angegebenen Wert
     */
    public void setZinssatz(int zinssatz)
    {
        this.zinssatz = zinssatz;
    }
    
    /**
     * Addiert den übergebenen Betrag zum Kontostand
     */
    public void geldEinzahlen(int betrag)
    {
        kontostand += betrag;
    }
    
    /**
     * Subtrahiert den übergebenen Betrag vom Kontostand
     */
    public void geldAbheben(int betrag)
    {
        kontostand -= betrag;
    }
    
    /**
     * Berechnet den Jahreszins aufgrund der gesetzten Attribute kontostand und zinssatz
     */
    public int jahreszinsBerechnen()
    {
        return (kontostand / 100) * zinssatz;
    }
    
    /**
     * Gibt Informationen über das Konto in der Konsole aus
     */
    public void zeigeKontoZustand()
    {
        System.out.println("Informationen zum Konto:");
        System.out.println("Kontoinhaber: " + kontoinhaber);
        System.out.println("Kontostand: CHF " + kontostand);
        System.out.println("Zinssatz: " + zinssatz + "%");
    }
}