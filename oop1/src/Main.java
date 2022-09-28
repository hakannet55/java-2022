public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(), product2 = new Product();

        // Set vals
        product1.setName("Süpürge");
        product1.setUrl("image.jpg");
        product1.setPrice(135);

        product2.setName("Süpürge - 2");
        product1.setUrl("image-2.jpg");
        product2.setPrice(115);
        // get vals
        Product[] prodList = {product1, product2};
        for (Product item : prodList) {
            System.out.println("ürün: " + item.getName());
        }


    }

}