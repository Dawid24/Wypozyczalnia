import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static final List<Car> carsList = new ArrayList<>();

    public static void addCar(Car car) {
        carsList.add(car);
    }

    public static void rentCar(int index) {

        if (carsList.get(index).getStatus() == Status.FREE) {
            carsList.get(index).setStatus(Status.RENT);
        }
    }

    public static void printData() {
        System.out.println(carsList);
    }
}
