
/**
 * Write a description of class Ticket here.
 * 
 * @author (raffaluc) 
 * @version (12.10.2015)
 */
public class Ticket
{
    private String name;
    private int category;
    private int amount;
    private int price;
    private int soldAmount;

    /**
     * Erzeugt eine Instanz mit dem Ticketnamen, der Kategorie, der Anzahl und dem Preis
     */
    public Ticket(String name, int category, int amount, int price)
    {
                this.name = name;
                this.category = category;
                this.amount = amount;
                this.price = price;
    }
    /**
     * Setzt den Namen, die Kategorie, die Azahl und den Preis des Tickets
     */
    public void setTicketDetails(String name, int categroy, int amount, int price)
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
     * Gibt die Summe aus Anzahl verkaufter Tickets und dem Preis zurück.
     */
    public int getEarnings()
    {
        return soldAmount * price;
    }
    /**
     * Kauft eine Anzahl Tickets, Überprüft ob noch genügend Tickets vorhanden sind
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
