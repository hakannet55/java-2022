package app.dataAccess;

import app.entities.Product;
import app.utils.Utils;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        // SQL  db erişim kısım
        String msg = "Hibernate ile veritabanına eklendi";
        Utils.print(msg);
    }
}
