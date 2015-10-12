
/**
 * Die Klasse Ticket erzeugt ein Ticket für ein Event
 * 
 * @author (raffaluc, wemlmax) 
 * @version (12.10.2015)
 */
public class Ticket
{
    private String name;
    private TicketCategory category;
    private int amount;
    private int price;
    private int soldAmount;
    
    public enum TicketCategory {
        VIP_TICKET,
        STAND_TICKET,
        INDOOR_TICKET
    }
    
    public Ticket()
    {
    }
    
    /**
     * Erzeugt eine Instanz mit dem Ticketnamen, der Kategorie, der Anzahl und dem Preis
     * 
     * @param name der Name des Tickets
     * @param category die Kategorie des Tickets
     * @param amount die Anzahl Tickets in Stück
     * @param price der Preis pro Ticket in Fr.
     */
    public Ticket(String name, TicketCategory category, int amount, int price)
    {
                this.name = name;
                this.category = category;
                this.amount = amount;
                this.price = price;
    }
    /**
     * Setzt den Namen, die Kategorie, die Azahl und den Preis des Tickets
     * 
     * @param name der Name des Tickets
     * @param category die Kategorie des Tickets
     * @param amount die Anzahl Tickets in Stück
     * @param price der Preis pro Ticket in Fr.
     */
    public void setTicketDetails(String name, TicketCategory categroy, int amount, int price)
    {
        this.name = name;
        this.category = categroy;
        this.amount = amount;
        this. price = price;
    }
    /**
     *  Gibt Informationen über das Ticket in der Konsole aus
     */
    public void printInfos()
    {
        System.out.println(name + ": " + soldAmount + " von " + amount + " verkauft, Einnahmen: CHF " + getEarnings( ));
    }
    /**
     * Gibt die Summe aus Anzahl und Preis der verkaufter Tickets zurück.
     * 
     * @return gibt die Summe aus Anzahl und Preis der verkaufter Tickets zurück.
     */
    public int getEarnings()
    {
        return soldAmount * price;
    }
    /**
     * Kauft eine Anzahl Tickets, Überprüft ob noch genügend Tickets vorhanden sind
     * 
     * @param amountToBuy anzahl Tickets die man kaufen will in Stück. 
     */
    public void buy(int amountToBuy)
    {
        if((amount - soldAmount) >= amountToBuy)
        {
            soldAmount += amountToBuy;
        }
        else
        {
            System.out.println("Not enough tickets in this category");
        }
    }
}
