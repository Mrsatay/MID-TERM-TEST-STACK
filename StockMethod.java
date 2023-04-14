import java.util.*;
public class StockMethod {

    public static void sortStockByInitialStock(Stock[] st) {
        // Sort by InitialStock in ascending order using bubble sort
        for (int i = 0; i < st.length - 1; i++) {
            for (int j = 0; j < st.length - i - 1; j++) {
                if (st[j].InitialStock > st[j+1].InitialStock) {
                    Stock temp = st[j];
                    st[j] = st[j+1];
                    st[j+1] = temp;
                }
            }
        }
    }

    public static void printSortedStock(Stock[] st) {
        // Print the sorted list
        System.out.println("");
        for (Stock s : st) {
            System.out.println(s.itemcode + " + " + s.name + " + " + s.category + " + " + s.InitialStock);
        }
    }

    public static void displayFoodItemsWithNoStock(Stock[] st) {
        // Display food items with no stock
        System.out.println("\nFood items with no stock:");
        for (Stock s : st) {
            if (s.category.equals("food") && s.InitialStock == 0) {
                System.out.println(s.itemcode + " + " + s.name);
            }
        }
    }

    public static void searchItem(Stock[] st, String search_item) {
        // Searching item
        for (int i = 0 ; i < st.length; i++){
            if (search_item.equalsIgnoreCase(st[i].name)){
                System.out.println(st[i].itemcode + " - "+ st[i].name + " - "+st[i].category+" - "+st[i].InitialStock);
            }
        }
    }

    public static void addStock(Stock[] st, Scanner sc) {
        System.out.println("\nDo you want to add item: ");
        String add_item = sc.nextLine();
    
        if (add_item.equalsIgnoreCase("yes")) {
            System.out.println("Input the code: ");
            String code = sc.nextLine();
            System.out.println("Input the name of product: ");
            String name = sc.nextLine();
            System.out.println("Input the Category of product: ");
            String category = sc.nextLine();
            System.out.println("Input the Initial Stock: ");
            int initialStock = sc.nextInt();
    
            // Find the first available index in the st array
            int index = -1;
            for (int i = 0; i < st.length; i++) {
                if (st[i] == null) {
                    index = i;
                    break;
                }
            }
    
            // If there is an available index, create a new Stock object and add it to the array
            if (index != -1) {
                st[index] = new Stock(code, name, category, initialStock);
                sc.nextLine(); // consume the remaining newline character
    
                sortStockByInitialStock(st);
                printSortedStock(st);
            } else {
                System.out.println("The stock list is full.");
            }
        }
    }
    

    public static void decreaseStock(Stock[] st, Scanner sc) {
        System.out.println("\nDo you want to decrease item stock: ");
        String decrease_item = sc.nextLine();
    
        if (decrease_item.equalsIgnoreCase("yes")){
            System.out.println("Input the code: ");
            String code = sc.nextLine();
            System.out.println("Input the quantity to decrease: ");
            int quantity = sc.nextInt();
    
            // search for the item with the input code
            for (int i = 0; i < st.length; i++){
                if (code.equalsIgnoreCase(st[i].itemcode)){
                    // decrease the initial stock of the item
                    st[i].InitialStock -= quantity;
                    System.out.println("Stock decreased successfully.");
                    System.out.println(st[i].itemcode + " - "+ st[i].name + " - "+st[i].category+" - "+st[i].InitialStock);
                    break;
                }
                // if the item with the input code is not found, continue searching
                if (i == st.length - 1){
                    System.out.println("Item not found.");
                }
            }
        }
    }
    
}