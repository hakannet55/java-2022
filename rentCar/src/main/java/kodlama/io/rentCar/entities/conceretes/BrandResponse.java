package kodlama.io.rentCar.entities.conceretes;

import kodlama.io.rentCar.entities.OperationResult;

import java.util.List;

public class BrandResponse {
    private List<Brand> dataList;
    private Brand data;
    private OperationResult result;

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

    public OperationResult getResult() {
        return result;
    }

    public void setResult(OperationResult result) {
        this.result = result;
    }
}
