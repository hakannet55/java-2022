package kodlamaio.bussines;

import kodlamaio.entity.BaseEntity;
import kodlamaio.entity.KursKategoriEntity;
import kodlamaio.entity.KursProgramEntity;

public interface BaseManager {
    void add(KursProgramEntity kursProgramEntity) throws Exception;

    void add(BaseEntity baseEntity) throws Exception;

    void add(KursKategoriEntity baseEntity) throws Exception;

    void remove(int id);
    <T> T list();

    <T> T findById(int id);
}
