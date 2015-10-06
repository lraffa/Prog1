
/**
 * Write a description of class Artist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artist
{
    // instance variables - replace the example below with your own
    private String artistName;
    private int artistSalary;

    /**
     * Constructor for objects of class Artist
     */
    public Artist(String artistName, int artistSalary)
    {
        setArtistDetails(artistName, artistSalary);
    }

    public void setArtistDetails(String artistName, int artistSalary)
    {
        this.artistName = artistName;
        this.artistSalary = artistSalary;
    }
    
    public void printInfos()
    {
        System.out.println(artistName + ", Gage: CHF "+artistSalary);
    }
    
    public int getSalary()
    {
        return artistSalary;
    }
}
