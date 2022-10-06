package kodlamaio.entity;

public abstract class BaseEntity {
    private String name;
    private int id;

    public BaseEntity() {

    }

    public BaseEntity(String name) {
        this.name = name;
    }

    public BaseEntity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
