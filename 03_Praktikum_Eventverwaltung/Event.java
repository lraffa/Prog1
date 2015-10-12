
/**
 * Write a description of class Event here.
 * 
 * @author (raffaluc, wemlmax) 
 * @version (12.10.2015)
 */
public class Event
{
    private Artist artist;
    private Ticket vipTicket;
    private Ticket standTicket;
    private Ticket indoorTicket;

    /**
     * Erzeugt eine Instanz ohne Angaben
     */
    public Event()
    {
        
    }
    
    /**
     * Erzeugt eine Instanz mit Künstlername, Gage, VIP-Tickets, Tribuehne-Tickets, Innenraum-Tickets
     * inkl. Anzahl und Preis der einzelnen Tickets
     */
    public Event(String artistName, int salary, int vipPrice, int standPrice, int indoorPrice, int vipTickets, int standTickets, int indoorTickets)
    {
        artist = new Artist(artistName, salary);
        vipTicket = new Ticket("VIP-Ticket", Ticket.TicketCategory.VIP_TICKET, vipTickets, vipPrice);
        standTicket = new Ticket("Stand-Ticket", Ticket.TicketCategory.STAND_TICKET, standTickets, standPrice);
        indoorTicket = new Ticket("Indoor-Ticket", Ticket.TicketCategory.INDOOR_TICKET, indoorTickets,  indoorPrice);
        
    }
    /**
     * Setzt den Namen und die Gage des Künstlers
     */
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
    /**
     * Setzt den Namen, die Kategorie, die Anzahl und den Preis eines Ticktes
     */
    public void setTicket(String name, Ticket.TicketCategory category, int amount, int price)
    {
        if(getTicketByCategory(category)==null)
        {
            createTicketByCategory(category).setTicketDetails(name, category, amount, price);
        }
        else
        {
            getTicketByCategory(category).setTicketDetails(name, category, amount, price);
        }        
    }

    /**
     * Kauft eine Anzahl Tickets einer bestimmten Ticket-Kategorie
     */
    public void buyTickets(Ticket.TicketCategory category, int amount)
    {
        getTicketByCategory(category).buy(amount);
    }
    /**
     * Gibt Informationen über den Event in der Konsole aus
     */
    public void showEvent()
    {
        artist.printInfos();
        int revenue = 0;
        for(Ticket.TicketCategory category : Ticket.TicketCategory.values())
        {
            Ticket ticket = getTicketByCategory(category);
            ticket.printInfos();
            revenue += ticket.getEarnings();
        }

        System.out.println("");
        System.out.println("Gewinn: CHF " +(revenue - artist.getSalary()));
    }
    
    private Ticket getTicketByCategory(Ticket.TicketCategory category)
    {
        switch(category)
        {
            case VIP_TICKET: return vipTicket;
            case STAND_TICKET: return standTicket;
            case INDOOR_TICKET: return indoorTicket;
            default: return null;
        }
    }
    
    private Ticket createTicketByCategory(Ticket.TicketCategory category)
    {
        switch(category)
        {
            case VIP_TICKET: return (vipTicket = new Ticket());
            case STAND_TICKET: return (standTicket = new Ticket());
            case INDOOR_TICKET: return (indoorTicket = new Ticket());
            default: return null;
        }
    }
}
