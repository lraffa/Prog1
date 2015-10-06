
/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event
{
    // instance variables - replace the example below with your own
    private Artist artist;
    private Ticket vipTicket;
    private Ticket standTicket;
    private Ticket indoorTicket;

    /**
     * Constructor for objects of class Event
     */
    public Event()
    {
        
    }
    
    public Event(String artistName, int salary, int vipPrice, int standPrice, int indoorPrice, int vipTickets, int standTickets, int indoorTickets)
    {
        artist = new Artist(artistName, salary);
        vipTicket = new Ticket("VIP-Ticket", 1, vipPrice, vipTickets);
        standTicket = new Ticket("Stand-Ticket", 2, standPrice, standTickets);
        indoorTicket = new Ticket("Indoor-Ticket", 3, indoorPrice, indoorTickets);
        
    }
    
    public void setArtist(String artistName, int artistSalary)
    {
        if(artist == null)
        {
            artist = new Artist(artistName, artistSalary);
        }
        else
        {
            artist.setArtistDetails(artistName, artistSalary);
        }
    }

    public void buyTickets(int category, int amount)
    {
        getTicketByCategory(category).buy(amount);
    }
    
    public void showEvent()
    {
        artist.printInfos();
        int revenue = 0;
        
        for(int i = 1; i <= 3; i++)
        {
            Ticket ticket = getTicketByCategory(i);
            ticket.printInfos();
            revenue += ticket.getEarnings();
        }
        /*
        System.out.println("VIP-Tickets: "+vipTicketsSold+" von "+ vipTickets + " verkauft, Einnahmen: CHF " + earnings);
        System.out.println("Tribuene-Tickets: "+standTicketsSold+" von "+standTickets+" verkauft, Einnahmen: CHF "+earnings);
        System.out.println("Innenraum-Tickets: "+indoorTicketsSold+" von "+indoorTickets+");
        */
        System.out.println("");
        System.out.println("Gewinn: CHF " +(revenue - artist.getSalary()));
    }
    
    private Ticket getTicketByCategory(int category)
    {
        switch(category)
        {
            case 1: return vipTicket;
            case 2: return standTicket;
            case 3: return indoorTicket;
            default: return null;
        }
    }
}
