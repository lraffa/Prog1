
/**
 * Write a description of class Artist here.
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
     */
    public Artist(String artistName, int artistSalary)
    {
        setArtistDetails(artistName, artistSalary);
    }
    /**
     * Setzt den Künstlernamen und seine Gage
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
     */
    public int getSalary()
    {
        return artistSalary;
    }
}
