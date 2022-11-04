package kodlama.io.rentCar.dataAccess.concretes;

import kodlama.io.rentCar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentCar.entities.conceretes.Brand;
import kodlama.io.rentCar.entities.conceretes.BrandResponse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // dataAcces nesnesidir
public class InMemoryBrandRepository {
    List<Brand> brandsData;

    public InMemoryBrandRepository() {
        brandsData = new ArrayList<>();
        brandsData.add(new Brand(1, "A1"));
        brandsData.add(new Brand(2, "B2"));
        brandsData.add(new Brand(3, "C3"));
    }

    public List<Brand> getAll() {
        return brandsData;
    }

    public void remove(Brand brand) {

    }
}
