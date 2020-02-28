import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {

    public static int randomNumber () {
        int number = (int) (Math.random() * 10);
        return number;
    }
    public static void compareAnswers() throws IOException {
        int count = 1;
        int maxCount = 3;
        int randomN = randomNumber();
        System.out.println("Угадайте число от 0 до 9. У вас есть три попытки.");
        for (int i = 0; i < maxCount; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int userNumber = Integer.parseInt(reader.readLine());
            if (userNumber == randomN) {
                System.out.println ("Поздравляем! Вы угадали.");
                break;
            }
            else if (userNumber > randomN) {
                System.out.println ("Вы ввели слишком большое число. У вас осталось " + (maxCount - count) +
                        " попытки");
            } else if  (userNumber < randomN) {
                System.out.println ("Вы ввели слишком маленькое число. У вас осталось " + (maxCount - count) +
                        " попытки");
            } count++;
        }
    }
    public static void main(String[] args) throws IOException {
        compareAnswers();
        while(true) {
            System.out.println("Желаете ли вы продолжить игру? Введите 1 если ДА или 0 если НЕТ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int exit = Integer.parseInt(reader.readLine());
            if (exit == 1) {
                compareAnswers();
            } else if (exit == 0) {
                System.out.println("Спасибо за игру");
                break;
            }
        }
    }
}
