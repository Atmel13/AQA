import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //welcomeUser(); //задание 1
        //displayNameInReverseOrder("Евгений"); //задание 2
        //displayRandomNumbers(25); //задание 3
        //isEnteredStringEqualTo("Pass4W0rd"); //задание 4
        //getResultsOfEnteredNumbers(5); //задание 5
        operationsWithEnteredNumbers(5); //задание 6

    }

    private static void welcomeUser() {

        System.out.println("Введите Ваше имя и нажмите <Enter>:");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name + "!");  //Приветствовать любого пользователя при вводе его имени через командную строку.

        System.out.println("Пункт 1 выполнен.");

    }

    private static void displayNameInReverseOrder(String name) {

        char[] reverseOrder = name.toCharArray();

        for (int i = reverseOrder.length - 1; i >= 0; i--) {

            System.out.print(reverseOrder[i]);  //Отобразить в окне консоли аргументы командной строки в обратном порядке.
        }

        System.out.println("\n" + "Пункт 2 выполнен.");
    }

    private static void displayRandomNumbers(int howManyNumbers) {

        int a = 0; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"

        for (int i = 0; i < howManyNumbers; i++) {

            System.out.print(a + (int) (Math.random() * b) + " ");

            if (Math.random() < 0.5) System.out.println(""); //возвращает 1 или 0 и сравнивает с 0.5
        }





    }

    private static void isEnteredStringEqualTo(String password) {

        System.out.println("Please enter correct password to activate the program and press \"Enter\" button");

        Scanner scan = new Scanner(System.in);
        String enteredPassword = scan.next();

        if (password.equals(enteredPassword)) System.out.println("Пароли совпадают!");
        else System.out.println("Пароли НЕ совпадают!");

    }

    private static void getResultsOfEnteredNumbers(int howManyNumbersToCount) {

        int resultSum = 0;
        int multiplicationNumbers = 1;

        System.out.println("Введите каждое число с новой строки");

        for (int i = 0; i < howManyNumbersToCount; i++) {

            Scanner scan = new Scanner(System.in);
            String enteredText = scan.next();
            int number = Integer.parseInt(enteredText);
            resultSum = resultSum + number;
            multiplicationNumbers = multiplicationNumbers*number;

        }

        System.out.println("Сумма введенных чисел = " + resultSum);
        System.out.println("Произведение введенных чисел = " + multiplicationNumbers);
    }

    private static void operationsWithEnteredNumbers(int howManyNumbersToCount) {

        System.out.println("Введите каждое число с новой строки");

        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < howManyNumbersToCount; i++) {

            Scanner scan = new Scanner(System.in);
            String enteredText = scan.next();
            int number = Integer.parseInt(enteredText);
            list.add(number);
        }

        System.out.print("Четные числа: ");

        for (int filledNumber : list) {

            if (filledNumber%2 == 0) System.out.print(filledNumber + " ");

        }

        System.out.print("\n" + "Нечетные числа: ");

        for (int filledNumber : list) {

            if (filledNumber%2 != 0) System.out.print(filledNumber + " ");

        }
    }
}
