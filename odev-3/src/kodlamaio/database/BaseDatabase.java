package kodlamaio.database;

import kodlamaio.entity.KursKategoriEntity;
import kodlamaio.entity.KursProgramEntity;
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

    public <T> T select(String entityName) {
        T entityObj = null;
        switch (entityName) {
            case "kurs":
                entityObj = (T) this.kurs;
                break;
            case "kategori":
                entityObj = (T) this.kursKategoriEntity;
                break;
        }
        return entityObj;
    }

    public <T> T selectFind(String entityName, int id) {
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
