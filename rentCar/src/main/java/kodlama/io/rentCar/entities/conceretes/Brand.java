package kodlama.io.rentCar.entities.conceretes;

import kodlama.io.rentCar.entities.OperationResult;

public class Brand {
    private int id;
    private String name;

    OperationResult result;

    public Brand(){
        super();
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
