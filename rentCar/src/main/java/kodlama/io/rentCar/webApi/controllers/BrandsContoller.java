package kodlama.io.rentCar.webApi.controllers;

import kodlama.io.rentCar.business.abstracts.BrandService;
import kodlama.io.rentCar.business.requests.CreateBrandRequest;
import kodlama.io.rentCar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsContoller {
    private final BrandService brandService;

    @Autowired
    public BrandsContoller(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll() {
        return this.brandService.getAll();
    }

    @GetMapping("/getAll_v2")
    public List<GetAllBrandsResponse> getAllv2() {
        //BrandResponse response = new BrandResponse();
        //response.setDataList(brandService.getAll());
        //response.setResult(new OperationResult(null,"Success"));
        return this.brandService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }
}
