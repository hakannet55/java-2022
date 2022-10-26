package kodlama.io.rentCar.dataAccess.concretes;

import kodlama.io.rentCar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentCar.entities.conceretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class brandRepositoyry2 {
    List<Brand> brandsData;

    public brandRepositoyry2() {
        brandsData = new ArrayList<>();
        brandsData.add(new Brand(1, "A"));
        brandsData.add(new Brand(2, "B"));
    }

     public List<Brand> getAll() {
        return brandsData;
    }

     public void remove(Brand brand) {

    }
}
