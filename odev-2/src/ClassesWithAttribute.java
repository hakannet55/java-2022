public class ClassesWithAttribute {
    public void start() {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.price = 125;
        product.stockAmount = 1;

        ProductManager manager = new ProductManager();
        manager.Add(product);

        System.out.println(product.name);
    }
}
