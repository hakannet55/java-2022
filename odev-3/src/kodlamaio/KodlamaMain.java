package kodlamaio;

import kodlamaio.bussines.KursManager;
import kodlamaio.database.BaseDatabase;
import kodlamaio.entity.KursProgramEntity;
import kodlamaio.models.CurrencyTypeEnum;
import kodlamaio.models.LogTypeEnum;
import kodlamaio.utils.Tool;

import java.util.ArrayList;

public class KodlamaMain {
    public void start() throws Exception {
        // Conf Configuration
        // Options
        // Price type TL / USD
        // Logger type
        Configuration conf = new Configuration(new BaseDatabase());
        conf.setCurrency(CurrencyTypeEnum.TL);
        conf.setLogType(LogTypeEnum.FILE);

        KursManager kursManager = new KursManager();
        KursProgramEntity kursProgramEntity = new KursProgramEntity();

        String[][] rawDataList = {{"Java Kurs 2022", "15"}, {"Java Kurs-Senior-2", "20"}, {"Java-2", "20"}};

        int index = 0;
        for (String[] subValue : rawDataList) {
            index++;
            kursProgramEntity.setId(index);
            kursProgramEntity.setName(subValue[0]);
            kursProgramEntity.setPrice(Integer.parseInt(subValue[1]));
            kursManager.add(kursProgramEntity);
        }

        KursProgramEntity kursProgramEntity2 = new KursProgramEntity("Java-2");
        kursProgramEntity2.setPrice(20);
        kursManager.add(kursProgramEntity2);

        ArrayList<KursProgramEntity> list = kursManager.list();
        Tool.print("toplam adet: " + list.size());
        Tool.print("dataList: " + list);
    }
}
