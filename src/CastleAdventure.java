import java.util.Arrays;
import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Частина 1: Увійди в Замок
        int [] secretCode = {1, 3, 2, 5, 4};
        int[] userCode = new int[5];
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt();
            if (userInput != secretCode[i]) {
                isCodeCorrect = false;
                System.out.println("Невірний код. Спробуй ще");
            }
        }
        Arrays.sort(userCode);
        Arrays.sort(secretCode);
        boolean isCodeCorrect1 = Arrays.equals(secretCode, userCode);

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }


    }
}