package kodlamaio.bussines;

import kodlamaio.Configuration;
import kodlamaio.database.BaseDatabase;
import kodlamaio.entity.BaseEntity;
import kodlamaio.entity.KursKategoriEntity;
import kodlamaio.entity.KursProgramEntity;
import kodlamaio.utils.Tool;

public class KategoryManager implements BaseManager {
    public BaseDatabase dbManager = Configuration.getDb();
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

    }

    @Override
    public <T> T list() {
        return null;
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
