package kodlama.io.rentCar.business.concretes;

import kodlama.io.rentCar.business.abstracts.BrandService;
import kodlama.io.rentCar.business.requests.CreateBrandRequest;
import kodlama.io.rentCar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentCar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentCar.entities.conceretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service // Business nesnesidir
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        // iş kuralları
        List<Brand> results = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList();
        for (Brand result : results) {
            GetAllBrandsResponse tempResponse = new GetAllBrandsResponse();
            tempResponse.setId(result.getId());
            tempResponse.setName(result.getName());
            brandsResponses.add(tempResponse);
        }
        return brandsResponses;
    }

    @Override
    public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.name);
        this.brandRepository.save(brand);
    }
}
