import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInteger(scanner, "Введите целое число a: ");
        int b = readInteger(scanner, "Введите целое число b: ");

        System.out.println("\n--- Результаты ---");

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение (a + b) = " + (a + b));
        System.out.println("Вычитание (a - b) = " + (a - b));
        System.out.println("Умножение (a * b) = " + (a * b));

        if (b != 0) {
            System.out.println("Деление (a / b) = " + (a / b)); // Деление происходит без остатка, так как в условии сказано, что на вход принимаются два целых числа
        } else {
            System.out.println("Деление (a / b) = Ошибка! Делить на ноль нельзя.");
        }

        scanner.close();
    }

    private static int readInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Ошибка: ввод не может быть пустым. Пожалуйста, введите число.\n");
                continue;
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено не целое число. Пожалуйста, попробуйте снова.\n");
            }
        }
    }
}