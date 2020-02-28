import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        // Задание №1
        int[] numbers1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == 0) {
                numbers1[i] = 1;
            } else {
                numbers1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers1));

        // Задание №2
        int[] numbers2 = new int[8];
        for (int i = 1; i < numbers2.length; i++) {
            numbers2[i] = numbers2[i - 1] + 3;
        }
        System.out.println(Arrays.toString(numbers2));

        // Задание №3
        int[] numbers3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] < 6) {
                numbers3[i] = numbers3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(numbers3));

        // Задание №4
        int[][] numbers4 = new int[6][6];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i][i] = 1;
        }
        for (int[] a : numbers4)
            System.out.println(Arrays.toString(a));

        // Задание №5
        int[] numbers5 = {3, 78, 54, -1, 43, 12, 67};
        int min = numbers5[0];
        int max = numbers5[0];
        for (int i = 0; i < numbers5.length; i++) {
            if (numbers5[i] < min) {
                min = numbers5[i];
                continue;
            }
            if (numbers5[i] > max) {
                max = numbers5[i];
            }
        }
        for (int i = 0; i < numbers5.length; i++) {
            if (numbers5[i] == max) {
                System.out.println("Индекс максимального числа: " + i);
                continue;
            }
            if (numbers5[i] == min) {
                System.out.println("Индекс минимального числа: " + i);
            }
        }
    }
}
