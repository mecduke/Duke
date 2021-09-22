package CoinCollection;

import java.util.ArrayList;

/**
 * A class that maintains information about an arbitrarily large coin collection.  
 * Individual coins may be accessed based on the order that they are inserted.  
 * 
 * @author Grant Braught, Tim Wahls, Louis Ziantz
 * @author (YOUR NAME HERE)
 * @version (PUT DATE HERE)
 */
public class CoinCollection {

    // The name of the collection
    private String collectionName;
    // The list of coins in the collection
    private ArrayList<Coin> coinList;
    
    /**
     * Create a new coin collection.
     * 
     * @param initCollName the name of the collection.
     */
    public CoinCollection(String initCollName) {
    	coinList = new ArrayList<Coin>();
    	collectionName = initCollName;
        // Add code here.
    }

    /**
     * Return the name of the CoinCollection
     * 
     * @return the name of the collection.
     */
    public String getCollectionName() { 
        // Replace with your code.
        return collectionName;
    }
    
    /**
     * Add a coin to the collection.
     * 
     * @param coin The coin to be added to the collection.
     */
    public void addCoin(Coin coin) {  
        // Add code here
    	coinList.add(coin);
    }
    
    /**
     * Remove the Coin at the indicated index in the collection.
     * If the specified index is not valid then an error message
     * is printed.
     * 
     * @param index The index of the Coin to be removed.
     */
    public void removeCoin(int index) {
        // Add code here.
    	if (index >= 0 && index < coinList.size()) {
    		coinList.remove(index);
    	} else {
    		System.out.println("Invalid index!");
    	}
    }
    
    /**
     * Return the size of the CoinCollection
     * 
     * @return the size of the collection.
     */
    public int sizeOfCollection() { 
        // Replace with your code.
        return coinList.size();
    }    
    
    /**
     * Print a full description of the Coin at the specified index 
     * in the collection. If the specified index is not valid then 
     * an error message is printed.  
     * 
     * @param index The index of the Coin to be printed.
     */
    public void printCoin(int index) {
        // Add code here.
        // Hint: You can call the toString method in the Coin class to get 
        // a String describing the Coin, then print that String.
    	if (index >= 0 && index < coinList.size()) {
    		String str = coinList.get(index).toString();
    		System.out.println(str);
    	} else {
    		System.out.println("Please specify a valid index!");
    	}
    }
    
    /**
     * Return the coin at the specified position in the collection. 
     * If the position is not valid, an error message is printed and
     * return null. 
     */
    public Coin getCoin(int pos) {
    	Coin coin1 = null;
    	if (pos >= 0 && pos < coinList.size()) {
    		coin1 = coinList.get(pos);
    	} else {
    		coin1 = null;
    		System.out.println("Invalid index!");
    	}
    	return coin1;
    }
    
    public static void main(Strings[] args) {
    	for (int i=3; i>=7; i++) { 
    		System.out.println(i); 
    	}
    }
}
