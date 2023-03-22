public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        menu();
    }

    public static void menu() {
        System.out.println("1 - испытать удачу\n" +
                "2 - посмотреть список игрушек\n" +
                "3 - добавить игрушку\n" +
                "0 - выход из программы");
        operation(TryInput.choiceOperation());
    }

    public static void operation(int choice) {
        if (choice == 0) {
            System.exit(1);
        }
        if (choice == 1) {
            ToyShop.lottery(fileUsing.readFile());
        }
        if (choice == 2) {
            fileUsing.watchToysList(fileUsing.readFile());
        }
        if (choice == 3) {
            fileUsing.inputToFile(TryInput.newToy());
        }
        menu();
    }
}
