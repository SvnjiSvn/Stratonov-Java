import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = readValidString(scanner, "Введите первую строку (a): ");
        String b = readValidString(scanner, "Введите вторую строку (b): ");

        System.out.println();

        // В задаче нет указание на игнорирование регистра, поэтому сравнение происходит по точному совпадению
        if (a.equals(b)) {
            System.out.println("Строки идентичны.");
        } else {
            System.out.println("Строки неидентичны.");
        }

        scanner.close();
    }

    private static String readValidString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Ошибка: ввод не может быть пустым или состоять только из пробелов. Попробуйте снова.\n");
            } else {
                return input;
            }
        }
    }
}