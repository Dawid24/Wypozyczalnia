import java.util.Scanner;

public class GUI {
    public static void startGUI() {
        System.out.println("Witamy!");
        System.out.println("Podaj dane samochodu: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marka: ");
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Cena: ");
        String price = scanner.nextLine();

        Car car = new Car(brand, model, Double.parseDouble(price));
        Repository.addCar(car);
    }
}
