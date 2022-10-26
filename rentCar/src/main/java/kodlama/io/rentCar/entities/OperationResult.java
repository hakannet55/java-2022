package kodlama.io.rentCar.entities;

import java.util.Optional;

public class OperationResult {
    String id;
    String message;
    String type;

    public OperationResult(String message, String type) {
        this.message = message;
        this.type = type;
    }
}
