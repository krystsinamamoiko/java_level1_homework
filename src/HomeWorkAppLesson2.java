public class HomeWorkAppLesson2 {

    public static void main(String[] args) {
        // print 'true' if sum of the given two int numbers is
        // between 10 and 20 (including borders) or print 'false' otherwise
        System.out.println(checkSum(10, 5));
        System.out.println(checkSum(10, 15));
        // print if the given int number is positive or negative
        printPositiveOrNegative(9);
        printPositiveOrNegative(-7);
        // print 'true' if the given int number is negative or print 'false' otherwise
        System.out.println(isNegative(10));
        System.out.println(isNegative(-15));
        // print the given string line the given number times
        printStringNTimes("Hello", 5);
        // print all leap years from 1600 to 2022
        for (int i = 1600; i <= 2022; i++) {
            if (isLeapYear(i)) { System.out.println(i + " год"); }
        }
    }

    private static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void printPositiveOrNegative(int a) {
        String message = a >= 0 ? "Положительное" : "Отрицательное";
        System.out.println(message + " число");
    }

    private static boolean isNegative(int a) {
        return a < 0;
    }

    private static void printStringNTimes(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 > 0 || year % 400 == 0);
    }
}
