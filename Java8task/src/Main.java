import java.util.*;
public class Main {


    public static void main(String[] args) {
        Exercises ex = new Exercises();

        //Obtain a list of products belongs to category “Books”
        List<Product> booksList = ex.listCategory("Books");
        System.out.println("list of products belongs to category “Books");
        ex.showList(booksList);
        System.out.println();

        //Obtain a list of products belongs to category “Books” with price > 100
        List<Product> booksPriceList = ex.checkPrice(100,booksList);
        System.out.println("list of products belongs to category Books with price > 100");
        ex.showList(booksPriceList);
        System.out.println();

        //Obtain a list of product with category = “Toys” and then apply 10% discount
        List<Product> toysDiscList = ex.discountList(0.1, ex.listCategory("Toys"));
        System.out.println("list of product with category = “Toys” and then apply 10% discount");
        ex.showList(toysDiscList);
        System.out.println();

       //Get the cheapest products of “Books” category
        System.out.println("the cheapest products of Books category");
        System.out.println(ex.cheapestCat(booksList));
    }

}