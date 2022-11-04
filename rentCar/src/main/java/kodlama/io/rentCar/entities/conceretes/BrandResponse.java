package kodlama.io.rentCar.entities.conceretes;

import kodlama.io.rentCar.entities.OperationResult;

import java.util.List;

public class BrandResponse {
    private List<Brand> dataList;
    private Brand data;

    public List<Brand> getDataList() {
        return dataList;
    }

    public void setDataList(List<Brand> dataList) {
        this.dataList = dataList;
    }

    public Brand getData() {
        return data;
    }

    public void setData(Brand data) {
        this.data = data;
    }

  }
