package kodlama.io.rentCar.business.abstracts;


import kodlama.io.rentCar.entities.conceretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
