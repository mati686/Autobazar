public class Car {
    String model;
    int price;
    boolean forSale;
    Owner owner;
    double compsumtion;

    VehicleType type;
    public Car (String model, VehicleType type, int price, boolean forSale, Owner owner, double compsumtion){
        this.model = model;
        this.type = type;
        this.price = price;
        this.forSale = forSale;
        this.owner = owner;
        this.compsumtion = compsumtion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getCompsumtion() {
        return compsumtion;
    }

    public void setCompsumtion(double compsumtion) {
        this.compsumtion = compsumtion;
    }
}
