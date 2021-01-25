import java.util.ArrayList;
import java.util.Collections;

public class Method {
    ArrayList<Product> arrayList = new ArrayList<>();
    public void add(Product product){
        arrayList.add(product);
    }
    public void delete(int idProduct){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(arrayList.get(i));
        }
    }
    public void update(int idProduct , String nameProduct){
        for (Product product: arrayList) {
            if (product.getIdProduct() == idProduct){
                product.setNameProduct(nameProduct);
            }
        }
    }
    public void showAll(){
        for (Product i: arrayList) {
            System.out.println(i.toString());
        }
    }
    public void search(String nameProduct){
        for (Product i:arrayList) {
            if (i.getNameProduct().equals(nameProduct)){
                System.out.println(i.toString());
            }else {
                System.out.println("Không có sản phẩm này");
            }
        }
    }
    public void sort(){
        PriceProductSort priceProductSort = new PriceProductSort();
        Collections.sort(arrayList,priceProductSort);
        for (Product product:arrayList) {
            System.out.println(product.toString());
        }
    }
}
