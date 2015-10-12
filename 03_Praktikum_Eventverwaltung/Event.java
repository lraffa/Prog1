
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
        vipTicket = new Ticket("VIP-Ticket", 1, vipTickets, vipPrice);
        standTicket = new Ticket("Stand-Ticket", 2, standTickets, standPrice);
        indoorTicket = new Ticket("Indoor-Ticket", 3, indoorTickets,  indoorPrice);
        
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
    public void setTicket(String name, int category, int amount, int price)
    {
        
        
           if(category == 1 && getTicketByCategory(1) == null)
           {
            Ticket ticket = getTicketByCategory(1);
            ticket = new Ticket(name, category, price, amount);
           }
        
          
           else if(category == 2 && getTicketByCategory(2) == null)
           {
            Ticket ticket = getTicketByCategory(2);
            ticket = new Ticket(name, category, price, amount);
           }
           else if(category == 3 && getTicketByCategory(3) == null)
           {
            Ticket ticket = getTicketByCategory(3);
            ticket = new Ticket(name, category, price, amount);
           }
        
           else
           {
            getTicketByCategory(category).setTicketDetails(name, category, amount, price);
           }
        
    }

    /**
     * Kauft eine Anzahl Tickets einer bestimmten Ticket-Kategorie
     */
    public void buyTickets(int category, int amount)
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
