import app.business.ProductManager;
import app.dataAccess.JdbcProductDao;
import app.entities.Product;
import app.logger.BaseLogger;
import app.logger.DatabaseLogger;
import app.logger.FileLogger;
import app.utils.Utils;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Utils.print("Start!");
        // UI product data inputs
        Product prod = new Product(1, "Samsung A51 128Gb", 5250);
        List<BaseLogger> loggers = Arrays.asList(new FileLogger(), new DatabaseLogger());
        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(prod);

        productManager.remove();

    }
}