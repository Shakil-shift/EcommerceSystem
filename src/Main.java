import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

public class Main {
    public static void main(String[] args) {
        // Creating Product instances
        Product product1 = new Product("P001", "Laptop", 1200.00);
        Product product2 = new Product("P002", "Smartphone", 800.00);
        
        // Creating a Customer instance
        Customer customer = new Customer("C001", "John Doe");
        
        // Adding products to the shopping cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        
        // Display the cart contents
        customer.displayCart();
        
        // Creating an order for the customer
        Order order = new Order("O001", customer);
        
        // Display the order summary
        order.generateOrderSummary();
    }
}