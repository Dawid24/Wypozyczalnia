public class Car {
    private Status status;
    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.status = Status.FREE;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car");
        sb.append("{");
        sb.append("brand: ");
        sb.append(this.brand);
        sb.append(", model: ");
        sb.append(this.model);
        sb.append(", price: ");
        sb.append(this.price);
        sb.append(", status: ");
        sb.append(this.status);
        sb.append("}");
        return sb.toString();
    }
}
