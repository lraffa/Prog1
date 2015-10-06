
/**
 * Write a description of class Ticket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private String name;
    private int category;
    private int amount;
    private int price;
    private int soldAmount;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String name, int category, int amount, int price)
    {
                this.name = name;
                this.category = category;
                this.amount = amount;
                this.price = price;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printInfos()
    {
        System.out.println(name + ": " + soldAmount + " von " + amount + " verkauft, Einnahmen: CHF " + getEarnings( ));
    }
    
    public int getEarnings()
    {
        return soldAmount * price;
    }
    
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
