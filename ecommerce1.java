package com.dest.ecommarce;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ecommerce1 {

    static class Color {
        public static final String RESET = "\033[0m";  // Text Reset
        public static final String RED = "\033[0;31m";    // RED
        public static final String GREEN = "\033[0;32m";  // GREEN
        public static final String YELLOW = "\033[0;33m"; // YELLOW
        public static final String BLUE = "\033[0;34m";   // BLUE
        public static final String PURPLE = "\033[0;35m"; // PURPLE
        public static final String CYAN = "\033[0;36m";   // CYAN
    }

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " - ₹" + price;
        }
    }

    static class Cart {
        private ArrayList<Product> items;

        public Cart() {
            items = new ArrayList<>();
        }

        public void addItem(Product product) {
            items.add(product);
        }

        public double getTotalPrice() {
            double total = 0;
            for (Product item : items) {
                total += item.getPrice();
            }
            return total;
        }

        public ArrayList<Product> getItems() {
            return items;
        }
    }

    static class BillGenerator implements Runnable {
        private Cart cart;
        private static final String COMPANY_NAME = "Fashions";
        private static final String LOCATION = "Bangalore, India";

        public BillGenerator(Cart cart) {
            this.cart = cart;
        }

        @Override
        public void run() {
            generateBill();
        }

        public void generateBill() {
            Date date = new Date();
            System.out.println(Color.PURPLE + "\n--- Final Bill ---" + Color.RESET);
            System.out.println(Color.CYAN + "Company: " + COMPANY_NAME + Color.RESET);
            System.out.println(Color.CYAN + "Date: " + date.toString() + Color.RESET);
            System.out.println(Color.CYAN + "Location: " + LOCATION + Color.RESET);
            System.out.println(Color.GREEN + "------------------------------" + Color.RESET);

            for (Product item : cart.getItems()) {
                System.out.println(Color.YELLOW + item + Color.RESET);
            }

            System.out.println(Color.GREEN + "Total: ₹" + cart.getTotalPrice() + Color.RESET);
            System.out.println(Color.GREEN + "------------------------------\n" + Color.RESET);

            String[] wishes = {
                "Thank you for shopping with us!",
                "We hope to see you again soon!",
                "Have a great day!",
                "Your satisfaction is our priority!",
                "Happy Shopping!",
                "Enjoy your purchase!",
                "Stay stylish and safe!",
                "Thank you for choosing " + COMPANY_NAME + "!",
                "Wishing you a wonderful day ahead!",
                "We appreciate your business!"
            };

            Random random = new Random();
            int wishIndex = random.nextInt(wishes.length);

            System.out.println(Color.RED + wishes[wishIndex] + Color.RESET);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Color.RED + "Welcome to Fashions - Your Ultimate Shopping Experience!" + Color.RESET);

        Cart cart = new Cart();
        ArrayList<Product> electronics = new ArrayList<>();
        ArrayList<Product> fashion = new ArrayList<>();
        ArrayList<Product> grocery = new ArrayList<>();
        ArrayList<Product> furniture = new ArrayList<>();
        ArrayList<Product> homeDecor = new ArrayList<>();

        // Electronics
        electronics.add(new Product("Laptop", 80000.00));
        electronics.add(new Product("Iphone", 60000.00));
        electronics.add(new Product("Apple", 25000.00));
        electronics.add(new Product("Headphones", 5000.00));
        electronics.add(new Product("Smartwatch", 15000.00));

        // Fashion
        fashion.add(new Product("Men's T-Shirt", 1200.00));
        fashion.add(new Product("Men's Shirt", 1800.00));
        fashion.add(new Product("Women's Dress", 4000.00));
        fashion.add(new Product("Kids Jacket", 2000.00));
        fashion.add(new Product("Kids Shoes", 1500.00));

        // Grocery
        grocery.add(new Product("Rice - 5kg", 300.00));
        grocery.add(new Product("Wheat Flour - 10kg", 400.00));
        grocery.add(new Product("Sugar - 2kg", 100.00));
        grocery.add(new Product("Cooking Oil - 1L", 150.00));
        grocery.add(new Product("Salt - 1kg", 20.00));

        // Furniture
        furniture.add(new Product("Dining Table", 15000.00));
        furniture.add(new Product("Sofa Set", 30000.00));
        furniture.add(new Product("Bed", 20000.00));
        furniture.add(new Product("Wardrobe", 25000.00));
        furniture.add(new Product("Chair", 3500.00));

        // Home Decor
        homeDecor.add(new Product("Wall Art", 5000.00));
        homeDecor.add(new Product("Vase", 2000.00));
        homeDecor.add(new Product("Cushion Cover", 500.00));
        homeDecor.add(new Product("Table Lamp", 3000.00));
        homeDecor.add(new Product("Rug", 4000.00));

        boolean shopping = true;

        while (shopping) {
            System.out.println(Color.CYAN + "Select a product category:" + Color.RESET);
            System.out.println("1. Electronics");
            System.out.println("2. Fashion");
            System.out.println("3. Grocery");
            System.out.println("4. Furniture");
            System.out.println("5. Home Decor");
            System.out.println("6. Checkout");

            int categoryChoice = scanner.nextInt();

            switch (categoryChoice) {
                case 1:
                    addProductToCart(scanner, electronics, cart);
                    break;
                case 2:
                    addProductToCart(scanner, fashion, cart);
                    break;
                case 3:
                    addProductToCart(scanner, grocery, cart);
                    break;
                case 4:
                    addProductToCart(scanner, furniture, cart);
                    break;
                case 5:
                    addProductToCart(scanner, homeDecor, cart);
                    break;
                case 6:
                    shopping = false;
                    System.out.print(Color.RED + "Ready to checkout? (yes/no): " + Color.RESET);
                    String readyToPay = scanner.next();
                    if (readyToPay.equalsIgnoreCase("yes")) {
                        // Generate the bill at checkout
                        Thread billThread = new Thread(new BillGenerator(cart));
                        billThread.start();
                        try {
                            billThread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Color.YELLOW + "Continue shopping..." + Color.RESET);
                        shopping = true;
                    }
                    break;
                default:
                    System.out.println(Color.RED + "Invalid choice. Please try again." + Color.RESET);
                    break;
            }
        }

        scanner.close();
    }

    private static void addProductToCart(Scanner scanner, ArrayList<Product> products, Cart cart) {
        displayProducts(products);

        System.out.print("Enter the product number to add to cart: ");
        int productChoice = scanner.nextInt();
        if (productChoice > 0 && productChoice <= products.size()) {
            Product selectedProduct = products.get(productChoice - 1);
            cart.addItem(selectedProduct);
            System.out.println(Color.YELLOW+ selectedProduct.getName() + " added to cart." + Color.RESET);
        } else {
            System.out.println(Color.RED + "Invalid choice. Please try again." + Color.RESET);
        }
    }

    private static void displayProducts(ArrayList<Product> products) {
        System.out.println(Color.GREEN + "Available products:" + Color.RESET);
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }
}