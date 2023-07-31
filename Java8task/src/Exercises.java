import java.util.*;

public class Exercises {
    private Product product = new Product();
    private List<Product> products = product.addDummyData();

    public List<Product> listCategory(String cat){
        List<Product> list = new ArrayList<>();
        Iterator<Product> itr = products.iterator();
        while(itr.hasNext()){
            Product productItr =  itr.next();
            if(productItr.getCategory().equals(cat))
                list.add(productItr);
        }
        return list;
    }

    public List<Product> checkPrice(int price, List<Product> list){
        List<Product> tempList = new ArrayList<>();
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()){
            Product productItr =  itr.next();
            if(productItr.getPrice() > price)
                tempList.add(productItr);
        }
        return tempList;
    }


    public List<Product> discountList(double dicount, List<Product> list){
        List<Product> tempList = new ArrayList<>();
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()){
            Product productItr =  itr.next();
            double newPrice = productItr.getPrice() * (1 - dicount);
            tempList.add(productItr.withPrice(newPrice));
        }
        return tempList;
    }

    public String cheapestCat(List<Product> list){
        ArrayList<Double> tempList = new ArrayList<>();
        Map<Double, Product> map = new TreeMap<>();
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()){
            Product productItr =  itr.next();
            tempList.add(productItr.getPrice());
            map.put(productItr.getPrice(), productItr);
        }
        return map.get(Collections.min(tempList)).toString();
    }


    public void showList(List<Product> list){
        Iterator<Product> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}
