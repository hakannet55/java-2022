package kodlamaio.Devs.business;

import kodlamaio.Devs.entities.RuleTypesEnum;
import kodlamaio.Devs.entities.models.RuleEngineData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class RuleEngineService {
    private final List<RuleEngineData> ruleDatalist;
    List<String> keys = new ArrayList<String>();

    public RuleEngineService(List<RuleEngineData> ruleDataList) {
        this.ruleDatalist = ruleDataList;
    }

    public RuleEngineService(List<RuleEngineData> ruleDataList, List<String> keys) {
        this.ruleDatalist = ruleDataList;
        this.keys = keys;
    }

    public String startControl(String[] keys, Object data) {
        String message = "";
        Map<String, Object> rData = (Map<String, Object>) data;
        if (keys != null && this.keys.size() == 0) {
            if (data instanceof String || data instanceof Integer) {
                rData = (Map<String, Object>) data;
            } else {
                for (String keyname : keys) {
                    rData = (Map<String, Object>) rData.get(keyname);
                }
            }
        }
        for (RuleEngineData ruleData : this.ruleDatalist) {
            if (message.isEmpty()) {
                if (this.control(ruleData, rData)) {
                    message = ruleData.getMessage();
                }
            }
        }
        return message;
    }

    public boolean control(RuleEngineData ruleData, Object data) {
        RuleTypesEnum ruleTypesEnum = ruleData.getControlType();
        if (ruleTypesEnum == RuleTypesEnum.BLANK) {
            // is empty
            return data == null;
        } else if (ruleTypesEnum == RuleTypesEnum.INT) {
            // is not number
            return data instanceof Integer;
        }
        return false;
    }
}
