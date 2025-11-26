package refactor;

import java.util.Scanner;


public class Refactor {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int option;
        do {
            option = chooseOption();

            if (option == 1) {
                int number = askSize();
                sumatory(number);
            } else if (option == 2) {
                int quantity = askSize();
                average(quantity);
            } else if (option == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }

        } while (option != 3);
    }

    private static int chooseOption() {
        int option;
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void average(int quantity) {
        double sum = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.print("Introduce un número:");
            sum += scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("La media es " + (sum / quantity));
    }

    private static void sumatory(int number) {
        int sumatory = 0;
        for (int i = 1; i <= number; i++) {
            sumatory += i;
        }

        System.out.println("El sumatorio es " + sumatory);
    }

    private static int askSize() {
        int number;
        do {
            System.out.print("Introduce un entero positivo: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);
        return number;
    }
}


