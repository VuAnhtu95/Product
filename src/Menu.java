import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Method method = new Method();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Sửa sản phẩm");
            System.out.println("3: Xóa sản phẩm");
            System.out.println("4: Hiển thị sản phẩm");
            System.out.println("5: Tìm kiếm sản phẩm");
            System.out.println("6: Sắp xếp sản phẩm");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1->{
                    Product product = new Product();
                    System.out.println("Nhập vào id sản phẩm : ");
                    product.setIdProduct(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập vào tên sản phẩm : ");
                    product.setNameProduct(scanner.nextLine());
                    System.out.println("Nhập vào giá sản phẩm : ");
                    product.setPriceProduct(Integer.parseInt(scanner.nextLine()));
                    method.add(product);
                    break;
                }
                case 3 ->{
                    System.out.println("Nhập vào id sản phẩm bạn muốn xóa : ");
                    int idProduct = Integer.parseInt(scanner.nextLine());
                    method.delete(idProduct);
                    break;
                }
                case 2 ->{
                    System.out.println("Nhập vào id sản phẩm bạn muốn sửa :");
                    int idProduct = Integer.parseInt(scanner.nextLine());
                    System.out.println("Bạn muốn sửa tên sản phầm thành gì? ");
                    String nameProduct = scanner.nextLine();
                    method.update(idProduct,nameProduct);
                }
                case 4->{
                    method.showAll();
                    break;
                }
                case 5->{
                    System.out.println("Bạn muốn tìm sản phẩm nào? ");
                    String nameProduct = scanner.nextLine();
                    method.search(nameProduct);
                }
                case 6->{
                    method.sort();
                }
            }
        }while (true);
    }
}
