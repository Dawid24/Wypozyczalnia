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
        try {
            validatePrice(price);
            Car car = new Car(brand, model, Double.parseDouble(price));
            Repository.addCar(car);
        } catch (ParsePriceException e) {
            System.out.println(e.getMessage());
        }

    }
    private static void validatePrice(String price) throws ParsePriceException {
        String pattern = "[0-9]+([\\.]{1}[0-9]{2})?";
        if (!price.matches(pattern)) {
            throw new ParsePriceException();
        }
    }
}
