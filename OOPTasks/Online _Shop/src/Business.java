import java.util.ArrayList;

public class Business {
    private ArrayList<Product> products = new ArrayList<>();
    Product p1 = new Product("Pen", 1, 8);
    Product p2 = new Product("Cup", 2, 6);
    Product p3 = new Product("Laptop", 1000, 2);
    Product p4 = new Product("Notebook", 1.5, 68);
    Product p5 = new Product("Keyboard", 23.6, 5);
    Product p6 = new Product("iphone", 2300, 9);

    public Business() {
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
    }

    public ArrayList<Product> getData(){
        return products;
    }

    public void showProducts(){
        int i = 1;
        for (Product item:
                products) {
            if(item.isAvailable()){
                System.out.println(i+ ") " + item.getName() + " cost "+ item.getPrice()+" $");
                i++;
            }
        }
    }


}
