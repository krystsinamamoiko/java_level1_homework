public class HomeWorkAppLesson03 {

    public static void main(String[] args) {
        /* Task 1: Задать целочисленный массив, состоящий из элементов 0 и 1
           С помощью цикла и условия заменить 0 на 1, 1 на 0 */
        System.out.println("-----------------Task 1:-------------------");
        int[] arrayTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Before:");
        printArray(arrayTask1);
        for (int i = 0; i < arrayTask1.length; i++) {
            if(arrayTask1[i] == 0) {
                arrayTask1[i] = 1;
            } else {
                arrayTask1[i] = 0;
            }
        }
        System.out.println("After:");
        printArray(arrayTask1);

        /* Task 2: Задать пустой целочисленный массив длиной 100.
           С помощью цикла заполнить его значениями 1 2 3 4 5 6 … 100; */
        System.out.println("-----------------Task 2:-------------------");
        int[] arrayTask2 = new int[100];
        for (int i = 0; i < arrayTask2.length; i++) {
            arrayTask2[i] = i + 1;
        }
        printArray(arrayTask2);

        /* Task 3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
           пройти по нему циклом, и числа меньшие 6 умножить на 2 */
        System.out.println("-----------------Task 3:-------------------");
        int[] arrayTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Before:");
        printArray(arrayTask3);
        for (int i=0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] < 6) {
                arrayTask3[i] *= 2;
            }
        }
        System.out.println("After:");
        printArray(arrayTask3);

        /* Task 4: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
           и с помощью цикла(-ов) заполнить его диагональные элементы единицами
           (можно только одну из диагоналей, если обе сложно).
           Определить элементы одной из диагоналей можно по следующему принципу:
           индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]; */
        System.out.println("-----------------Task 4:-------------------");
        int size = 9;
        int[][] arrayTask4 = new int[size][size];
        for (int i = 0; i < arrayTask4.length; i++) {
            for (int j = 0; j < arrayTask4[i].length; j++) {
                if (i == j || i + j == arrayTask4.length - 1) {
                    arrayTask4[i][j] = 1;
                }
            }
        }
        printArray(arrayTask4);

        /* Task 5: Написать метод, принимающий на вход два аргумента:
           len и initialValue, и возвращающий одномерный массив типа int
           длиной len, каждая ячейка которого равна initialValue */
        System.out.println("-----------------Task 5:-------------------");
        int[] arrayTask5 = initiateArray(10, 7);
        printArray(arrayTask5);

        /* Task 6*: Задать одномерный массив и найти в нем минимальный
           и максимальный элементы */
        System.out.println("-----------------Task 6:-------------------");
        int[] arrayTask6 = {1, 9, 31, 2, 81, 4, 57, 21, 6, 8, 0, 1};
        printArray(arrayTask6);
        int min = arrayTask6[0];
        int max = arrayTask6[0];
        for (int i = 1; i < arrayTask6.length; i++) {
            if (arrayTask6[i] < min) {
                min = arrayTask6[i];
            }
            if (arrayTask6[i] > max) {
                max = arrayTask6[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        /* Task 7**: Написать метод, в который передается не пустой
           одномерный целочисленный массив, метод должен вернуть true,
           если в массиве есть место, в котором сумма левой и правой
           части массива равны. */
        System.out.println("-----------------Task 7:-------------------");
        int[] arrayTask7 = {2, 2, 2, 1, 2, 2, 10, 1}; //{1, 1, 1, 2, 1}
        System.out.println(checkBalance(arrayTask7));

        /* Task 8***: Написать метод, которому на вход подается одномерный массив
           и число n (может быть положительным, или отрицательным), при этом метод
           должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
           Для усложнения задачи нельзя пользоваться вспомогательными массивами. */
        System.out.println("-----------------Task 8:-------------------");
        int[] arrayTask8 = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(arrayTask8);
        moveArray(arrayTask8, 2);
        printArray(arrayTask8);
        moveArray(arrayTask8, -2);
        printArray(arrayTask8);
    }

    public static int[] initiateArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static boolean checkBalance(int[] arr) {
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            int sumRight = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    public static void moveArray(int[] arr, int move) {
        for (int i = 0; i < Math.abs(move); i++) {
            if (move < 0) {
                int k = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = k;
            } else {
                int k = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = k;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
