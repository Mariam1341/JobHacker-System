import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product item){
        item.buy();
        products.add(item);
    }

    public void removeProduct(Product item){
        products.remove(item);
    }

    public float totalCost(){
        float total = 0;
        for ( Product item : products) {
            total += item.getPrice();
        }
        return total;
    }
    public ArrayList<Product> retriveProducts(){
        return products;
    }

    public void showProducts(){
        int i = 1;
        for (Product item:
                products) {
                System.out.println(i+ ") " + item.getName() + " cost "+ item.getPrice()+" $");
                i++;
        }
    }

    public void clear(){
        products.clear();
    }


}
