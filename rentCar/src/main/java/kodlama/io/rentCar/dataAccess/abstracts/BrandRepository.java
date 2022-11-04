package kodlama.io.rentCar.dataAccess.abstracts;

import kodlama.io.rentCar.entities.conceretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
