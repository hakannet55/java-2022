package kodlamaio.bussines;

import kodlamaio.Configuration;
import kodlamaio.database.BaseDatabase;
import kodlamaio.entity.BaseEntity;
import kodlamaio.entity.KursKategoriEntity;
import kodlamaio.entity.KursProgramEntity;
import kodlamaio.models.EntityTypesEnum;
import kodlamaio.utils.Tool;

import java.util.ArrayList;

public class KursManager implements BaseManager {
    public BaseDatabase dbManager = Configuration.getDb();
    public EntityTypesEnum entityType = EntityTypesEnum.COURSE;

    public KursManager() {
    }

    @Override
    public void add(KursProgramEntity kursProgramEntity) throws Exception {
        this.dbManager.connect();
        if (dbManager == null) {
            throw new Exception("database eklenmedi");
        }
        // , BaseDatabase dbManager
        // this.dbManager = dbManager;
        if (!kursProgramEntity.isValidPrice()) {
            Tool.print("Eklenemedi: price 10 dan küçük olamaz");
        }
        ArrayList<KursProgramEntity> list = this.list();

        if (!kursProgramEntity.isValidDuplicateControl(list)) {
            Tool.print("Eklenemedi: aynı isim olamaz: "+ kursProgramEntity.getName() );
        }
        this.dbManager.insert(kursProgramEntity);
    }

    @Override
    public void add(BaseEntity baseEntity) throws Exception {

    }

    @Override
    public void add(KursKategoriEntity baseEntity) throws Exception {

    }

    @Override
    public void remove(int id) {
        this.dbManager.connect();
        this.dbManager.remove(id);
    }

    @Override
    public <T> T list() {
        return this.dbManager.select(this.entityType);
    }

    @Override
    public BaseEntity findById(int id) {
        return null;
    }
}
