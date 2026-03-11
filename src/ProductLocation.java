/**

  Această clasă se concentrează pe stocarea brută a coordonatelor, fiind o entitate de date esențială pentru logica de mapare.
 
 * Clasa ProductLocation reține coordonatele geografice unde un produs
 * a fost marcat ca fiind găsit.
 */
public class ProductLocation {
    private String productName;
    private double latitude;
    private double longitude;

    public ProductLocation(String productName, double latitude, double longitude) {
        this.productName = productName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Metoda importantă: Afișarea locației salvate pentru debug/UI
    public void displayLocation() {
        System.out.println("Produs: " + productName + " | Lat: " + latitude + " | Lon: " + longitude);
    }

    public static void main(String[] args) {
        // Obiect pentru apelarea metodei
        ProductLocation pastaLocation = new ProductLocation("Pasta", 47.1739, 27.5749);
        pastaLocation.displayLocation();
    }
}
