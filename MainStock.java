import java.util.Scanner;

public class MainStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create some sample stock items
        Stock[] st = {
            new Stock("16030927", "Indomilk", "drink", 100),
            new Stock("16100617", "Sprite", "drink", 70),
            new Stock("16240401", "Yakult", "drink", 500),
            new Stock("16270525", "Indomie", "food", 250),
            new Stock("16971204", "Oreo", "food", 320),
            new Stock("16100727", "Chocochips", "food", 120),
            new Stock("16460329", "Ballpoint", "stationary", 75),
            new Stock("16320421", "Pencil", "stationary", 110),
            new Stock("16180729", "Book", "stationary", 57),
        };

        // call the methods in the StockMethod class
        StockMethod.sortStockByInitialStock(st);
        StockMethod.printSortedStock(st);
        StockMethod.displayFoodItemsWithNoStock(st);

        System.out.print("\nSearch for an item:");
        String search_item = sc.nextLine();
        StockMethod.searchItem(st, search_item);

        StockMethod.addStock(st, sc);
        StockMethod.decreaseStock(st, sc);

    }
}


