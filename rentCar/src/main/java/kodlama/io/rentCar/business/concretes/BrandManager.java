package kodlama.io.rentCar.business.concretes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import kodlama.io.rentCar.business.abstracts.BrandService;
import kodlama.io.rentCar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentCar.entities.conceretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Business nesnesidir
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        // iş kuralları
        return brandRepository.getAll();
    }
}
