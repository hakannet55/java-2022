package app.business;

import app.dataAccess.ProductDao;
import app.entities.Product;
import app.logger.BaseLogger;
import app.logger.FileLogger;
import app.utils.Utils;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<BaseLogger> loggers;

    private Product lastProd;

    public ProductManager(ProductDao productDao, List<BaseLogger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        this.lastProd = product;
        // iş kuralı, business
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
        Utils.addLog(loggers, "ürün adı " + product.getName());
    }

    public void remove() {
        Utils.addLog(new FileLogger(), "!! ürün silindi -> " + this.lastProd.getName());
    }
}
