import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        System.out.println("--- Результаты ---");

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
            System.out.println("Деление (a / b) = " + (a / b));
        } else {
            System.out.println("Деление (a / b) = Ошибка! Делить на ноль нельзя.");
        }

        scanner.close();
    }
}