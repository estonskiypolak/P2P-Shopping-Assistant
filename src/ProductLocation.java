import java.util.ArrayList;
import java.util.List;

/**
 * Clasa ShoppingList gestionează o listă de produse și permite 
 * marcarea acestora ca fiind finalizate.
 */
public class ShoppingList {
    private String listName;
    private List<String> items;
    private List<String> completedItems;

    public ShoppingList(String listName) {
        this.listName = listName;
        this.items = new ArrayList<>();
        this.completedItems = new ArrayList<>();
    }

    // Metoda cea mai importantă: Marcarea unui produs ca fiind cumpărat
    public void markAsCompleted(String item) {
        if (items.contains(item)) {
            items.remove(item);
            completedItems.add(item);
            System.out.println("Produsul '" + item + "' a fost marcat ca finalizat.");
        } else {
            System.out.println("Produsul '" + item + "' nu se află în listă.");
        }
    }

    public void addItem(String item) {
        items.add(item);
    }

    public static void main(String[] args) {
        // Obiect pentru a apela metoda
        ShoppingList myCart = new ShoppingList("Cumpărături Săptămânale");
        myCart.addItem("Pasta");
        myCart.addItem("Chicken breast meat");
        
        // Apelul metodei importante
        myCart.markAsCompleted("Pasta");
    }
}
