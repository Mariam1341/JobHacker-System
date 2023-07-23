import java.util.ArrayList;

public class Order {
    public void placeOrder(ShoppingCart cart){
        System.out.println("------- your order -------");
        for (Product item:
                cart.retriveProducts()) {
            item.buy();
            System.out.println(item.getName() + "   ::   " + item.getPrice() + " $");
        }
        System.out.println("--------------------------");
        System.out.println("Total cost :  " + cart.totalCost());
    }
}
