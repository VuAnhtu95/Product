public class Product {
    private String nameProduct;
    private int idProduct;
    private long priceProduct;

    public Product(String nameProduct, int idProduct , long priceProduct) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
    }
    public Product(){}

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public long getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(long priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString(){
        return "Sản phẩm có id là " + idProduct + " tên sản phẩm là " + nameProduct + " giá " + priceProduct;
    }
}
