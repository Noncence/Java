import java.util.Random;
import java.util.Scanner;

    public class Game {

        private static final char DOT_X = 'X';
        public static int DOTS_TO_WIN = 4;
        private static int stepCounter = 0;
        private static final char DOT_O = 'O';
        private static final char DEFAULT = '_';
        private static final Random rnd = new Random();

        public static void main(String[] args) throws InterruptedException {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер поля");
            int size = in.nextInt();
            char[][] tab = new char[size][size];
            initTable(tab);
            boolean isInGame = true;
            while (isInGame) {
                System.out.println("Введите номер строки и номер столбца для хода");
                print(tab);
                int x = in.nextInt(), y = in.nextInt();
                x--; y--;
                if  (isValidStep(x, y, tab)) {
                    tab[y][x] = DOT_X;
                    if (isWin(DOT_X, tab)) {
                        print(tab);
                        System.out.println("Вы победили");
                        return;
                    }
                    stepCounter++;
                    if (stepCounter == size * size) {
                        print(tab);
                        System.out.println("Ничья");
                        return;
                    }
                    movePC(tab);
                    System.out.println("Ход противника");
                    for (int i = 0; i < 7; i++) {
                        System.out.print(" * ");
                        Thread.sleep(200);
                    }
                    System.out.println();
                    if (isWin(DOT_O, tab)) {
                        print(tab);
                        System.out.println("Вы проиграли");
                        return;
                    }
                }
            }
        }

        private static boolean isWin(char ch, char[][] tab) {
            // горизонт
            int count = 0;
            for (int i = 0; i < tab.length; i++){
                for(int j = 0; j < tab.length; j++) {
                    if (tab[i][j] != ch && count !=4) {
                        count=0;
                    }
                    if (tab[i][j] == ch) {
                        count++;
                    }
                }
                if (count >= DOTS_TO_WIN) {return true;}
                else {count = 0; }
            }

            // вертикаль
            for (int j = 0; j < tab.length; j++){
                for(int i = 0; i < tab.length; i++) {
                    if (tab[i][j] != ch && count !=4) {
                        count=0;
                    }
                    if (tab[i][j] == ch) {
                        count++;
                    }
                }
                if (count >= DOTS_TO_WIN) {return true;}
                else {count = 0; }
            }

            // диагональ с решением для поля 5X5
            // центральная диагональ
            for (int i = 0; i < tab.length; i++) {
                if (tab[i][i] != ch && count != 4) {
                    count = 0;
                }
                if (tab[i][i] == ch) {
                    count++;
                }
            }
            if (count >= DOTS_TO_WIN) {return true;}
            else {count = 0;}
            // диагональ слева от центральной
            for (int i = 1; i <= tab.length-1; i++){
                if (tab[i][i-1] == ch){
                    count++;}
            }
            if (count >= DOTS_TO_WIN) {return true;}
            else {count = 0; }
            //диагональ справа от центральной
            count= 0;
            for (int i = 0; i < tab.length-1; i++){
                if (tab[i][i+1] == ch){
                    count++;}
            }
            if (count >= DOTS_TO_WIN) {return true;}
            else {count = 0; }

            // Вторая диагональ с универсальным решением под любой размер поля.
            int i1 = 0;
            int j1 = 0;
            for (int i = tab.length-1; i >= 0; i--) {
                for (int j = 0; j < tab.length; j++) {
                    if (tab[i][j] == ch) {
                        if (count == 0)
                        {i1 = i;
                            j1 = j;}
                        if (i != 0) {i--;}
                        if (i == 0 && j == tab.length-1 && count != DOTS_TO_WIN ) {count = 0;}
                        if (j == tab.length-1 && count != DOTS_TO_WIN) {count = 0;}
                        count++;
                        if (count >= DOTS_TO_WIN) {
                            return true;
                        }
                    }
                    else if (count > 0 && tab[i][j] != ch) {
                        i = i1;
                        j = j1;
                        count = 0;
                    } else if (count <= 0 && tab[i][j] != ch) {}
                }
            }
            return false;
        }

        private static void movePC(char[][] tab) {
            while (true) {
                int x = rnd.nextInt(tab.length), y = rnd.nextInt(tab.length);
                if (isValidStep(x, y, tab)) {
                    tab[y][x] = DOT_O;
                    stepCounter++;
                    return;
                }
            }
        }



        private static boolean isValidStep(int x, int y, char[][] tab) {
            int size = tab.length;
            if (x >= 0 && x < size && y >= 0 && y < size) {
                return tab[x][y] == DEFAULT;
            }
            return false;
        }

        /*   1 2 3
         * 1 |_|_|_|
         * 2 |_|_|_|
         * 3 |_|_|_|
         *
         */
        private static void print(char[][] tab) {
            System.out.print("   ");
            for (int i = 0; i < tab.length; i++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
            for (int i = 0; i < tab.length; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < tab.length; j++) {
                    System.out.print("|" + tab[i][j]);
                }
                System.out.println("|");
            }
        }

        private static void initTable(char[][] tab) {
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    tab[i][j] = DEFAULT;
                }
            }
        }
    }
