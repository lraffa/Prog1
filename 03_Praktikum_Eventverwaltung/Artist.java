
/**
 * Die Klasse Artist erzeugt einen Künstler für ein Event
 * 
 * @author (raffaluc, wemlmax) 
 * @version (12.10.2015)
 */
public class Artist
{
    // instance variables - replace the example below with your own
    private String artistName;
    private int artistSalary;

    /**
     * Erzeugt eine Instanz mit Künstlername und Gage
     * 
     * @param artistName der Name der Künstlers
     * @param artistSalary die Gage des Künstlers in Fr.
     */
    public Artist(String artistName, int artistSalary)
    {
        setArtistDetails(artistName, artistSalary);
    }
    /**
     * Setzt den Künstlernamen und seine Gage
     * 
     * @param artistName der Name des Künstlers
     * @param artistSalary die Gage des Künstlers in Fr.
     */
    public void setArtistDetails(String artistName, int artistSalary)
    {
        this.artistName = artistName;
        this.artistSalary = artistSalary;
    }
    /**
     * Gibt Informationen über den Künstler in der Konsole aus
     */
    public void printInfos()
    {
        System.out.println(artistName + ", Gage: CHF "+artistSalary);
    }
    /**
     * Gibt die Gage des Künstlers zurück
     * 
     * @return gibt die Gage des Künstlers zurück in Fr.
     */
    public int getSalary()
    {
        return artistSalary;
    }
    /**
     * Gibt den Namen des Künstlers zurück
     * 
     * @return gibt den Namen des Künstlers zurück
     */
    public String getArtistName()
    {
        return artistName;
    }
}
