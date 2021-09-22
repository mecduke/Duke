package CoinCollection;

/**
 * A class that maintains information about a coin.  
 * It may be used as part of a coin collection.
 * 
 * @author Grant Braught, Tim Wahls, Louis Ziantz
 * 
 */

public class Coin {

    private String type;        // e.g., Penny, Lincoln
    private int year;           // the year the coin was issued
    private String condition;   // e.g., fair, good, fine, mint
    private double value;       // the estimated value of the coin

    /**
     * Create a new Coin.
     * @param initType the type of the Coin.
     * @param initYear the year of the Coin.
     * @param initCondition the condition of the Coin.
     * @param initValue the initial value of the Coin.
     */
    public Coin(String initType, int initYear, String initCondition,
                double initValue)
    {
        type = initType;
        year = initYear;
        condition = initCondition;
        value = initValue;
    }

    /**
     * Returns the condition of the Coin.
     * @return the condition of the Coin.
     */
    public String getCondition() 
    { 
        return condition; 
    }  
    
    /**
     * Returns the type of the Coin.
     * @return the type of the Coin.
     */
    public String getType() 
    { 
        return type; 
    }
        
    /**
     * Returns the year the Coin was minted.
     * @return the year the Coin was minted.
     */
    public int getYear() 
    { 
        return year; 
    }
    
    /**
     * Returns the value of the Coin.
     * @return the value of the Coin.
     */
    public double getValue() 
    { 
        return value; 
    }
    
    /**
     * Sets the value of the Coin.
     * @param newValue the new value of the Coin.
     */
    public void setValue(double newValue) 
    { 
        value = newValue; 
    }

    /**
     * Returns a String containing all of the information about the Coin. The 
     * String will have the format:
     * <pre><code>
     * Type: Quarter
     * Year: 1795
     * Condition: Mint
     * Value: 100.25
     * </code></pre>
     * 
     * @return a String representation of the Coin.
     */
    public String toString() 
    {
        String str ="";
        
        str = str + "Type : " + type + "\n";
        str = str + "Year : " + year + "\n";
        str = str + "Condition : " + condition + "\n";
        str = str + "Value : " + value + "\n";
        
        return str;
    }
}

