package kodlamaio;

import kodlamaio.bussines.KategoryManager;
import kodlamaio.bussines.KursManager;
import kodlamaio.database.BaseDatabase;
import kodlamaio.entity.KursKategoriEntity;
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
        BaseDatabase dbTp = new BaseDatabase();
        CurrencyTypeEnum currencyTp = CurrencyTypeEnum.TL;
        LogTypeEnum logTp = LogTypeEnum.FILE;

        Configuration conf = new Configuration(dbTp);
        conf.setCurrency(currencyTp);
        conf.setLogType(logTp);

        // add to DB kurs
        KursManager kursManager = new KursManager();
        KursProgramEntity kursProgramEntity = new KursProgramEntity();

        // category
        KategoryManager kategoryManager= new KategoryManager();
        KursKategoriEntity kursKategoriEntity = new KursKategoriEntity();
        String[] rawDataList1 = {"Web Tasarım", "Boot Camp", "Grafikerlik"};
        int index = 0;
        for (String categoryName : rawDataList1) {
            index++;
            kategoryManager.setId(index);
            kategoryManager.setName(categoryName);
            kategoryManager.add(kursKategoriEntity);
        }

        String[][] rawDataList2 = {{"Java Kurs 2022", "15"}, {"Java Kurs-Senior-2", "20"}, {"Java-2", "20"}};

        int index2 = 0;
        for (String[] subValue : rawDataList2) {
            index2++;
            kursProgramEntity.setId(index2);
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
