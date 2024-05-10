import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Business bus = new Business();
        ShoppingCart cart = new ShoppingCart();
        Order order = new Order();
        ArrayList<Product> products = bus.getData();

        System.out.println("Welcome in our Online Shop there are the products: ");
        bus.showProducts();

        boolean flag = true;
        while (flag){
            System.out.println("\nEnter the code for operation you wanna do now: \n(O for Order)\n(A for Add)\n(D for delete)\n(Q for exit the shop)");
            Scanner input = new Scanner(System.in);
            String check = input.next().toUpperCase();
            switch (check){
                case "A":
                    System.out.println("All products: ");
                    bus.showProducts();
                    System.out.println("Enter the code for the product you wanna add: ");
                    int code = input.nextInt();
                    Product pA = products.get(--code);
                    cart.addProduct(pA);
                    break;
                case "D":
                    System.out.println("All products in the cart: ");
                    cart.showProducts();
                    System.out.println("Enter the code for the product you wanna delete: ");
                    code = input.nextInt();
                    Product pD = products.get(--code);
                    cart.removeProduct(pD);
                    break;
                case "O":
                    order.placeOrder(cart);
                    break;
                case "Q":
                    flag = false;
                    break;
                default:
                    System.out.println("Enter available operation......try again ");
            }

        }

    }
}