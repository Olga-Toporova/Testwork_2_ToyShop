import java.util.Scanner;


public class TryInput {

    public static int choiceOperation() {
        int a = 0;
        boolean isTrue = false;
        while (!isTrue) {
            a = inputChoiceNumber();
            if (a >= 0 && a <= 3) {
                isTrue = true;
            } else {
                System.out.println("Введено некорректное значение, попробуйте снова");
            }
        }
        return a;
    }

    public static int inputChoiceNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите число в диапазоне 0 - 3");
                return Integer.parseInt(sc.next());
            } catch (NumberFormatException ne) {
                System.out.println("Введено некорректное значение, попробуйте снова");
            }
        }
    }

    public static Toy newToy() {
        String name = inputName();
        double weight = 0;
        boolean isTrue = false;
        while (!isTrue) {
            weight = inputWeight();
            if (weight > 0 && weight <= 100) {
                isTrue = true;
            } else {
                System.out.println("Введено некорректное значение, попробуйте снова");
            }
        }
        Toy toy = new Toy();
        toy.setName(name);
        toy.setWeight(weight);
        return toy;
    }

    public static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название игрушки: ");
        return sc.nextLine().replace(" ", "");
    }

    public static double inputWeight() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите вес (значение от 1 до 100): ");
                return Double.parseDouble(sc.next());
            } catch (NumberFormatException ne) {
                System.out.println("Введено некорректное значение, попробуйте снова");
            }
        }
    }
}