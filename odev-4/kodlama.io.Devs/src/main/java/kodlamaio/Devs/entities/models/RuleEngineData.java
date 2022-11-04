package kodlamaio.Devs.entities.models;

import kodlamaio.Devs.entities.RuleEngineTypeEnum;
import kodlamaio.Devs.entities.RuleTypesEnum;

public class RuleEngineData {
    String message;
    RuleTypesEnum controlType;

    public RuleEngineData(String message, RuleTypesEnum controlType) {
        this.message = message;
        this.controlType = controlType;
    }

    public RuleTypesEnum getControlType() {
        return controlType;
    }

    public void setControlType(RuleTypesEnum controlType) {
        this.controlType = controlType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
