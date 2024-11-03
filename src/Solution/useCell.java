// File: Solution/useCell.java
package Solution;

import java.util.Scanner;
import java.util.InputMismatchException;

// Main class to use Cell_Billing and capture user input
public class useCell
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            // Prompt for user input
            System.out.print("Enter the customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter the talk time in minutes: ");
            int talkTime = scanner.nextInt();

            System.out.print("Enter the price per minute: ");
            double pricePerMinute = scanner.nextDouble();

            // Instantiate Cell_Billing with user input
            Cell_Billing bill = new Cell_Billing(customerName, talkTime, pricePerMinute);

            // Print the bill
            bill.print_bill();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Invalid input. Please enter the correct data type.");
        }
        finally
        {
            scanner.close(); // Close scanner in finally to ensure it's always closed
        }
    }
}
