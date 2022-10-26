package kodlama.io.rentCar.dataAccess.abstracts;

import kodlama.io.rentCar.entities.conceretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();

    void remove(Brand brand);
}
