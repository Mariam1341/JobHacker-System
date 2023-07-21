public class Product {
    private String name;
    private double price;
    private int available;

    private ValidationUnit valid = new ValidationUnit();

    public Product(String name, double price, int available) {
        if(valid.isValidString(name)){
            this.name = name;
        }else{
            System.out.println("The Product name can not be null or empty");
        }
        if(valid.isValidPrice(price)){
            this.price = price;
        }else{
            System.out.println("The Product price can not be zero");
        }

        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available > 0;
    }

    public void buy() {
        this.available--;
    }
    public void returnItem() {
        this.available++;
    }
}
