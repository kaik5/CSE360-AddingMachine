/**
 * @author Jiajun Kong
 * Course: CSE360
 * Assignment: 1
 * Description: This class implements a functionality as an adding machine
 */
package cse360assignment02;

public class AddingMachine
{
    private int total;
    private String history;

    /**
     * Constructor
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";

    }

    /**
     * Get total value
     * This method returns the current total
     * @return the total value
     */
    public int getTotal ()
    {
        return total;
    }

    /**
     * Add to total
     * This method add a value to total.
     * @param value An integer to be added to the total
     */
    public void add (int value)
    {
        total += value;
        history += " + " + Integer.toString(value);
    }

    /**
     * Subtract from total
     * This method subtracts the parameter from the total variable
     * @param value An integer to be subtracted from the total
     */
    public void subtract (int value)
    {
        total -= value;
        history += " - " + Integer.toString(value);
    }

    /**
     * Get history of transaction
     * This method returns a string that indicating the process of the adding machine
     * @return A string indicating the computing process of the transactions from 0 to current input
     */
    public String toString () {
        return history;
    }

    /**
     * Reset all the values
     * This method reset all the values of the class
     */
    public void clear()
    {
        history = "0";
        total = 0;
    }
}

