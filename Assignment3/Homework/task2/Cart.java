package Assignment3.Homework.task2;

public class Cart {
    private int cartNumber;
    private String[] items;
    private double[] prices;
    private int itemCount;
    private double discountRate;
    
    // Constructor initializes an empty cart
    public Cart() {
        this.items = new String[3]; // Max 3 items
        this.prices = new double[3];
        this.itemCount = 0;
        this.discountRate = 0.0;
    }
    
    // Create a cart with a specific number
    public void create_cart(int cartNumber) {
        this.cartNumber = (cartNumber);
    }
    
    // Add item to cart (String, double version)
    public void addItem(String itemName, double price) {
        if (itemCount < 3) {
            items[itemCount] = itemName;
            prices[itemCount] = price;
            itemCount++;
            System.out.println(itemName + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    
    // Add item to cart (double, String version)
    public void addItem(double price, String itemName) {
        // This version has parameters in reverse order
        addItem(itemName, price);
    }
    
    // Apply discount to cart
    public void giveDiscount(double discountPercentage) {
        this.discountRate = discountPercentage;
    }
    
    // Calculate total price with discount applied
    public double getTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < itemCount; i++) {
            sum += prices[i];
        }
        
        if (discountRate > 0) {
            sum = sum * (1 - discountRate / 100);
        }
        
        return sum;
    }
    
    // Display cart contents (renamed from showCart to match tester)
    public void cartDetails() {
        System.out.println("Your cart(" + cartNumber + ") : ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
        }
        System.out.println("Discount Applied: " + discountRate + "%");
        System.out.println("Total price: " + getTotalPrice());
    }
    
    // Get number of items in cart
    public int getItemCount() {
        return itemCount;
    }
}