import java.util.Comparator;

public class PriceProductSort implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2){
        if (product1.getPriceProduct()>product2.getPriceProduct()){
            return 1;
        }else if (product1.getPriceProduct()== product2.getPriceProduct()){
            return 0;
        }else {
            return -1;
        }
    }
}
