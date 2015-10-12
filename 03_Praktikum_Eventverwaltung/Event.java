
/**
 * Die Klasse Event erzeugt ein Event.
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
     * 
     * @param artistName der Name des Künstlers
     * @param salary die Gage des Künstlers in Fr.
     * @param vipPrice die Kosten eines VIP-Tickests in Fr.
     * @param standPrice die Kosten eines Tribuehnen-Tickets in Fr.
     * @param indoorPrice die Kosten eines Innenraum-Tickets in Fr.
     * @param vipTickets die Anzahl VIP-Tickets in Stück
     * @param standTickets die Anzahl Triebuehnen-Tickets in Stück.
     * @param indoorTickets die Anzahl Innenraum-Tickets in Stück.
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
     * 
     * @param artistName der Name des Künstlers
     * @param artistSalary die Gage des Künstlers in Fr.
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
     * 
     * @param name der Name des Tickets
     * @param category die Ticket-Kategorie aus der Klasse Ticket
     * @amount die anzahl Tickets in Stück
     * @price der Preis pro Ticket in Fr.
     * 
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
     * 
     * @param category die Ticket-Kategorie aus der Klasse Ticket
     * @param amount die anzahl Tickets in Stück
     */
    public void buyTickets(Ticket.TicketCategory category, int amount)
    {
        getTicketByCategory(category).buy(amount);
    }
    /**
     * Gibt Informationen über den Event in der Konsole aus
     * 
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
    /**
     *  Gibt die Ticket Art nach Kategorie zurück
     *  
     *  @param category die Ticket-Kategorie aus der Klasse Ticket
     *  
     *  @return das Ticket in der gewünschten Ticket-Kategorie 
     */
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
    /**
     *  Erstellt ein Ticket nach Kategorie
     *  
     *  @param category die Ticket-Kategorie aus der Klasse Ticket
     *  
     *  @return das neue Ticket in der gewünschten Ticket-Kategorie
     */
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
