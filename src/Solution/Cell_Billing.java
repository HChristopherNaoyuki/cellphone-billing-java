// File: Solution/Cell_Billing.java
package Solution;

// Cell_Billing class extends Cell and implements print_bill
public class Cell_Billing extends Cell
{
    // Constructor for Cell_Billing that calls the superclass constructor
    public Cell_Billing(String customerName, int talkTime, double pricePerMinute)
    {
        super(customerName, talkTime, pricePerMinute);
    }

    // Method to print the bill
    @Override
    public void print_bill()
    {
        double totalBill = talkTime * pricePerMinute; // Calculate total
        System.out.println("\nCUSTOMER: " + customerName);
        System.out.println("TALK TIME: " + talkTime);
        System.out.println("PRICE PER MINUTE: " + pricePerMinute);
        System.out.println("TOTAL BILL: R " + totalBill + "\n");
    }
}
