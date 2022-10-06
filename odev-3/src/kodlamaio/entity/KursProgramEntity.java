package kodlamaio.entity;

import kodlamaio.Configuration;
import kodlamaio.utils.Tool;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class KursProgramEntity extends BaseEntity {
    double price;

    public KursProgramEntity() {

    }

    public KursProgramEntity(String name) {
        super(name);
    }

    public KursProgramEntity(String name, int id) {
        super(name, id);
    }

    public KursProgramEntity(String name, int id, double price) {
        super(name, id);
        this.price = price;
    }

    public boolean isValidPrice() {
        boolean priceValid = this.price > 10;
        Tool.print("priceValid: " + (priceValid ? "true" : "false"));
        return priceValid;
    }

    public boolean isValidDuplicateControl(ArrayList<KursProgramEntity> kursProgramEntities) {
        AtomicBoolean priceValid = new AtomicBoolean(true);
        String nameValue = this.getName();
        kursProgramEntities.forEach(sub -> {
            if (nameValue.equals(sub.getName())) {
                priceValid.set(false);
            }
        });

        return priceValid.get();
    }

    public String getPrice() {
        return price + " " + Configuration.currency;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
