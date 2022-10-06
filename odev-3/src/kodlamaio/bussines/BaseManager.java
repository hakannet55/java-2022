package kodlamaio.bussines;

import kodlamaio.entity.KursProgramEntity;

public interface BaseManager {
    void add(KursProgramEntity kursProgramEntity) throws Exception;

    void remove(int id);
    <T> T list();

    <T> T findById(int id);
}
