package kodlamaio.Devs.entities.conceretes;

import kodlamaio.Devs.entities.models.OperationResult;

import java.util.List;

public class LanguageResponse {
    private List<Language> dataList;
    private Language data;
    private OperationResult result;

    public List<Language> getDataList() {
        return dataList;
    }

    public void setDataList(List<Language> dataList) {
        this.dataList = dataList;
    }

    public Language getData() {
        return data;
    }

    public void setData(Language data) {
        this.data = data;
    }

    public OperationResult getResult() {
        return result;
    }

    public void setResult(OperationResult result) {
        this.result = result;
    }
}
