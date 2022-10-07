package kodlamaio.database;

import kodlamaio.entity.KursKategoriEntity;
import kodlamaio.entity.KursProgramEntity;
import kodlamaio.models.EntityTypesEnum;
import kodlamaio.utils.Tool;

import java.util.ArrayList;
import java.util.List;

public class BaseDatabase {
    List<KursProgramEntity> kurs = new ArrayList<>();
    List<KursKategoriEntity> kursKategoriEntity = new ArrayList<>();

    public void connect() {
        Tool.print("connect");
    }

    public void insert(KursKategoriEntity baseEntity) {
        this.kursKategoriEntity.add(baseEntity);
        Tool.print("insert db:" + baseEntity.getName() + ' ' + baseEntity.getId());
    }

    public void insert(KursProgramEntity baseEntity) {
        this.kurs.add(baseEntity);
        Tool.print("insert db:" + baseEntity.getName() + ' ' + baseEntity.getId() + " price: " + baseEntity.getPrice());
    }

    public void update() {
        Tool.print("update");
    }

    public void remove(int id) {
        Tool.print("remove where id=" + id);
    }

    public <T> T select(EntityTypesEnum entityName) {
        return switch (entityName) {
            case COURSE -> (T) this.kurs;
            case CATEGORY -> (T) this.kursKategoriEntity;
            default -> null;
        };
    }

    public <T> T selectFind(EntityTypesEnum entityName, int id) {
        ArrayList<T> entityList = select(entityName);
        T findObj = null;
        for (int i = 0; i < entityList.size(); i++) {
            if (entityList.get(i).equals(i)) {
                findObj = entityList.get(i);
            }
        }
        return findObj;
    }
}
