public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW", "3", 350.01);
        Car c2 = new Car("Mercedes", "S", 999.99);
        Repository.addCar(c);
        Repository.addCar(c2);
        Repository.printData();
        Repository.rentCar(0);
        Repository.printData();

    }
}
