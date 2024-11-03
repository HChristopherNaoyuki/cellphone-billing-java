// File: Solution/Cell.java
package Solution;

// Abstract class Cell implementing iPrintable interface
public abstract class Cell implements iPrintable
{
    // Protected variables for customer details
    protected String customerName;
    protected int talkTime;
    protected double pricePerMinute;

    // Constructor to initialize variables
    public Cell(String customerName, int talkTime, double pricePerMinute)
    {
        this.customerName = customerName;
        this.talkTime = talkTime;
        this.pricePerMinute = pricePerMinute;
    }

    // Getter for customer name
    public String getCustomerName()
    {
        return customerName;
    }

    // Getter for talk time
    public int getTalkTime()
    {
        return talkTime;
    }

    // Getter for price per minute
    public double getPricePerMinute()
    {
        return pricePerMinute;
    }
}
