public class ClassesWithAttribute {
    public void start() {
        Product product = new Product();
        product._name = "Laptop";
        product.setId(1);
        product._price = 125;
        product._stockAmount = 1;
        product._renk = "red";

        ProductManager manager = new ProductManager();
        manager.Add(product);
        manager.Add2(1, "asd", 123);

        String kod = product.getKod();
        System.out.println(product._name + " id: " + Integer.toString(product.getId()));
        System.out.println("kod->" + kod);
    }
}
