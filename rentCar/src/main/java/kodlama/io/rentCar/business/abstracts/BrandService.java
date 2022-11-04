package kodlama.io.rentCar.business.abstracts;


import kodlama.io.rentCar.business.requests.CreateBrandRequest;
import kodlama.io.rentCar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentCar.entities.conceretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
