package kodlamaio.bussines;

import kodlamaio.Configuration;
import kodlamaio.database.BaseDatabase;
import kodlamaio.entity.BaseEntity;
import kodlamaio.entity.KursKategoriEntity;
import kodlamaio.entity.KursProgramEntity;
import kodlamaio.models.EntityTypesEnum;
import kodlamaio.utils.Tool;

public class KategoryManager implements BaseManager {
    public BaseDatabase dbManager = Configuration.getDb();
    private EntityTypesEnum entityType = EntityTypesEnum.CATEGORY;
    private int id;
    private String name;

    @Override
    public void add(KursProgramEntity kursProgramEntity) throws Exception {

    }

    @Override
    public void add(BaseEntity baseEntity) throws Exception {

    }

    @Override
    public void add(KursKategoriEntity baseEntity) throws Exception {
        Tool.print("Kategori eklendi:"+ baseEntity.getName());
        this.dbManager.connect();
        this.dbManager.insert(baseEntity);
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
    public <T> T findById(int id) {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(int id) {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(int id) {
        return this.name;
    }


}
