package game.inventory;

/**
 * Item.java
 * This class is for a game title in our shop.
 *
 *   Your Name:        Alperen BELLİGÜN
 *   Your Student ID:  240446014
 *   Your Date:        05.10.2026
 */
public class Item {

    // private variables (other classes cannot see them directly)
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode; // secret code

    // main constructor
    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    // public get methods
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // no public or private here. it is "package-private".
    // only classes in the same folder (like Inventory) can use this.
    String getSerialCode() {
        return serialCode;
    }

    // private helper method. I only use this inside this class.
    private boolean isAvailable(int quantity) {
        if (stockCount >= quantity) {
            return true;
        } else {
            return false;
        }
    }

    // public method to sell games
    public void sell(int quantity) {
        // check if we have enough stock
        if (isAvailable(quantity) == true) {
            stockCount = stockCount - quantity;
            System.out.println("Sold " + quantity + " copies of " + name + ". Remaining: " + stockCount);
        } else {
            System.out.println("WARNING: We don't have enough stock for " + name + ". You want: " + quantity + ", We have: " + stockCount);
        }
    }
}