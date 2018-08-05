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

    public static void login() {
        System.out.println("Witamy!");
        System.out.println("Podaj login: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();
        boolean authFlag = Repository.authenticateUser(login, password);
        System.out.println(authFlag);
        if (authFlag) {
            menu();
        } else {
            System.exit(0);
        }
    }

    public static void menu() {
        System.out.println("1. Exit");
        System.out.println("");
        System.out.println("Podaj wybór: ");
        Scanner scanner = new Scanner(System.in);
        String chosen = scanner.nextLine();
        switch (chosen) {
            case "1":
                System.exit(0);
                break;
            case "2":
        }
    }
}
