import java.util.Random;
import java.util.Scanner;

public class HomeWorkAppLesson04 {

    public static void main(String[] args) {
        String[][] playField = initField(5);
        printField(playField);

        while (true) {
            humanTurn(playField);
            printField(playField);
            if (isDraw(playField)) {
                System.out.println("Ничья!");
                break;
            }
            if (checkWin(playField, 4, "X")) {
                System.out.println("Поздравляем! Вы выиграли!");
                break;
            }

            computerTurn(playField);
            printField(playField);
            if (isDraw(playField)) {
                System.out.println("Ничья!");
                break;
            }
            if (checkWin(playField, 4, "0")) {
                System.out.println("К сожалению, вы проиграли :( ");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }

    private static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    private static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }

    private static void humanTurn(String[][] field) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Введите координаты х и у, чтобы сделать ход:");
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            int size = field.length;
            if (x >= 0 && y >= 0 && x < size && y < size) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Данная клетка уже занята!");
                }
            } else {
                System.out.println("Вы вышли за пределы игрового поля!");
            }
        }
    }

    private static void computerTurn(String[][] field) {
        System.out.println("Ход искусственного интеллекта:");
        boolean user_win = false;
        // Блокировка хода пользователя, если он побеждает на следующем ходу
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                // если клетка не занята
                if (field[i][j].equals("*")) {
                    // проверяем может ли эта клетка стать "победной" для пользователя
                    field[i][j] = "X";
                    if (checkWin(field, 4, "X")) {
                        // клетка "победная" для пользователя, то блокируем ее
                        field[i][j] = "O";
                        user_win = true;
                    } else {
                        // если клетка "непобедная" то не трогаем ее
                        field[i][j] = "*";
                    }
                }
            }
        }

        // если какая-либо клетка поля не была заблокирована, то будем делать выбор клетки произвольным образом
        while(!user_win) {
            Random r = new Random();
            int x = r.nextInt(field.length);
            int y = r.nextInt(field.length);
            if (field[x][y].equals("*")) {
                field[x][y] = "O";
                break;
            }
        }
    }

    //проверка победы
    public static boolean checkWin(String[][] field, int winCounter, String turn) {
        int hor, ver;
        int size = field.length;
        //проверка по горизонтали и вертикали
        for (int i = 0; i < size; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < size; j++) {
                if (field[i][j].equals(turn)) {
                    hor++;
                } else if (hor < winCounter){
                    hor = 0;
                }
                if (field[j][i].equals(turn)) {
                    ver++;
                } else if (ver < winCounter){
                    ver = 0;
                }
            }
            if (hor == winCounter|| ver == winCounter) {
                return true;
            }
        }

        int diag1 = 0;
        int diag2 = 0;
        // Проверка по диагоналям
        // - Проверка диагоналей над побочной диагональю:
        for( int k = winCounter - 1; k < size ; k++) {
            diag1 = 0;
            for( int j = 0 ; j <= k ; j++) {
                int i = k - j;
                if (field[i][j].equals(turn)) {
                    diag1++;
                } else if (diag1 < winCounter){
                    diag1 = 0;
                }
            }
            if (diag1 == winCounter) {
                return true;
            }
        }
        // - Проверка диагоналей под побочной диагональю:
        for( int k = size - 2 ; k >= winCounter - 1; k--) {
            diag2 = 0;
            for( int j = 0 ; j <= k ; j++) {
                int i = k - j;
                if (field[size - j - 1][size - i - 1].equals(turn)) {
                    diag2++;
                } else if (diag2 < winCounter){
                    diag2 = 0;
                }
            }
            if (diag2 == winCounter) {
                return true;
            }
        }

        // - Проверка диагоналей под/над главнй диагональю:
        for( int k = 0; k <= size - winCounter; k++) {
            diag1 = 0;
            diag2 = 0;
            for( int i = 0 ; i < size - k; i++) {
                int j = i + k;
                // - над главнй диагональю:
                if (field[i][j].equals(turn)) {
                    diag1++;
                } else if (diag1 < winCounter){
                    diag1 = 0;
                }
                // - под главнй диагональю:
                if (field[j][i].equals(turn)) {
                    diag2++;
                } else if (diag2 < winCounter){
                    diag2 = 0;
                }
            }
            if (diag1 == winCounter) {
                return true;
            }
            if (diag2 == winCounter) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }
}