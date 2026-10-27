/**
 *
*   Your Name:        Alperen BELLİGÜN
*   Your Student ID:  240446014
*   Your Date:        05.10.2026
*/


import game.inventory.Item;
import game.inventory.Inventory;

/**
 * GameShop.java
 * Main class to test the shop and inventory.
 */
public class GameShop {

    public static void main(String[] args) {

        Inventory myShop = new Inventory();

        // create 3 games
        Item game1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item game2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item game3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        // add games to my shop
        myShop.addItem(game1);
        myShop.addItem(game2);
        myShop.addItem(game3);

        // show first list
        myShop.displayAll();
        System.out.println(""); // empty line

        // try to sell games
        System.out.println("--- Selling Games ---");
        game1.sell(4); // this will work
        game2.sell(6); // this will give warning! (we only have 5)

        System.out.println("");

        // show list again to see new stocks
        myShop.displayAll();
        System.out.println("");

        // check serial codes
        myShop.auditSerialCodes();

        // --- MY STUDY NOTE FOR EXAM ---
        // System.out.println(game1.getSerialCode());
        // I tried this code but it gives an error.
        // Why? Because GameShop is NOT in "game.inventory" package.
        // getSerialCode() is package-private, so I cannot call it from outside!
    }
}