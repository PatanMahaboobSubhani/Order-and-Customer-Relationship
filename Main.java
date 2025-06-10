public class Customer {
    private String name;
    private String email;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Display customer info
    public void displayCustomerInfo() {
        System.out.println("Customer: " + name + " | Email: " + email);
    }
}

import java.util.List;

public class Order {
    private Customer customer; // Composition: Order has-a Customer
    private List<String> items;

    // Constructor
    public Order(Customer customer, List<String> items) {
        this.customer = customer;
        this.items = items;
    }

    // Display full order info
    public void displayOrder() {
        customer.displayCustomerInfo();
        System.out.println("Items in Order:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Subhani", "subhani@gmail.com");

        // Create order with a list of items
        Order order = new Order(cust, Arrays.asList("Laptop", "Mouse", "USB Cable"));
        order.displayOrder();
    }
}
