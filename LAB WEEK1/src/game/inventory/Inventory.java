package game.inventory;

/**
 * Inventory.java
 * This class keeps all the items (games) in a list.
 *
 *    Your Name:        Alperen BELLİGÜN
 *    Your Student ID:  240446014
 *    Your Date:        05.10.2026
 */
public class Inventory {

    private Item[] items;
    private int count; // how many games we have

    public Inventory() {
        items = new Item[10]; // maximum 10 games for now
        count = 0;
    }

    // add a new game to the array
    public void addItem(Item item) {
        // check if array is full
        if (count < items.length) {
            items[count] = item;
            count = count + 1; // increase count
        } else {
            System.out.println("Inventory is full!");
        }
    }

    // print all games in shop
    public void displayAll() {
        System.out.println("--- Shop Inventory ---");
        for (int i = 0; i < count; i++) {
            // I used simple + instead of printf because it is easier :)
            System.out.println(items[i].getName() + " | " + items[i].getGenre() + " | Stock: " + items[i].getStockCount());
        }
    }

    // print secret serial codes.
    // Inventory can use getSerialCode() because they are in the same package (game.inventory).
    public void auditSerialCodes() {
        System.out.println("--- Secret Serial Codes ---");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].getName() + " -> " + items[i].getSerialCode());
        }
    }
}