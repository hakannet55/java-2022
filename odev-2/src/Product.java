public class Product {
    String _name;
    String _description;
    double _price;
    int _stockAmount;
    String _renk;
    // attribute - field
    private int _id;

    // getter
    public int getId() {
        return _id;
    }

    // setter
    public void setId(int id) {
        _id = id;
    }

    public String getKod() {
        return this._name.substring(0, 1) + this.getId();
    }
}
