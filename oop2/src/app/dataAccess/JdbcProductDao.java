package app.dataAccess;

import app.entities.Product;
import app.utils.Utils;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        // SQL  db erişim kısım
        String msg = "Jdbc ile veritabanına eklendi";
        Utils.print(msg);
    }
}
