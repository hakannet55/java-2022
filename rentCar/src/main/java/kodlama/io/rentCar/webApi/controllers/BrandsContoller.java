package kodlama.io.rentCar.webApi.controllers;

import kodlama.io.rentCar.business.abstracts.BrandService;
import kodlama.io.rentCar.business.concretes.BrandManager;
import kodlama.io.rentCar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentCar.dataAccess.concretes.InMemoryBrandRepository;
import kodlama.io.rentCar.dataAccess.concretes.brandRepositoyry2;
import kodlama.io.rentCar.entities.OperationResult;
import kodlama.io.rentCar.entities.conceretes.Brand;
import kodlama.io.rentCar.entities.conceretes.BrandResponse;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLEngineResult;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsContoller {
    private BrandService brandService;

    @Autowired
    public BrandsContoller(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @GetMapping("/getAll_v2")
    public List<Brand> getAllv2(){
        BrandResponse response = new BrandResponse();
        response.setDataList(brandService.getAll());
        response.setResult(new OperationResult(null,"Success"));
        return brandService.getAll();
    }
}
