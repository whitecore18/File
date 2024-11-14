import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("output.txt", true);

            while (true) {
                System.out.println("Вводите данные для записи:");
                String input = scanner.nextLine();

                fileWriter.write(input + System.lineSeparator());

                System.out.println("Введите что-нибудь еще (или 'exit' для выхода):");
                String continueInput = scanner.nextLine();

                if (continueInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                scanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}