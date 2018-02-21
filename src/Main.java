import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int howManyNumbersToCount = 5;
        ArrayList<Integer> list = new ArrayList();

        System.out.println("Введите " + howManyNumbersToCount + " чисел. Каждое число с новой строки");

        for (int i = 0; i < howManyNumbersToCount; i++) {
            Scanner scan = new Scanner(System.in);
            String enteredText = scan.next();
            int number = Integer.parseInt(enteredText);
            list.add(number);
        }

        //welcomeUser(); //задание 1
        //displayNameInReverseOrder("Евгений"); //задание 2
        //displayRandomNumbers(25); //задание 3
        //isEnteredStringEqualTo("Pass4W0rd"); //задание 4
        //getResultsOfEnteredNumbers(howManyNumbersToCount); //задание 5
        //findEvenAndOddNumbers(list); //задание 6.1
        //findMinMax(list); //задание 6.2
        //divisionOfNnumbers39(list); //задание 6.3
        //divisionOfNnumbers5and7(list); //задание 6.4
        notContainSameNumbers(list); //задание 6.5

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
            multiplicationNumbers = multiplicationNumbers * number;

        }

        System.out.println("Сумма введенных чисел = " + resultSum);
        System.out.println("Произведение введенных чисел = " + multiplicationNumbers);
    }

    private static void  findEvenAndOddNumbers(ArrayList<Integer> listOfNumbers) {

        System.out.print("Четные числа: ");

        for (int filledNumber : listOfNumbers) {

            if (filledNumber % 2 == 0) System.out.print(filledNumber + " ");

        }

        System.out.print("\n" + "Нечетные числа: ");

        for (int filledNumber : listOfNumbers) {

            if (filledNumber % 2 != 0) System.out.print(filledNumber + " ");

        }
    }

    private static void  findMinMax(ArrayList<Integer> listOfNumbers) {

        Collections.sort(listOfNumbers);

        System.out.println("Наименьшее число = " + listOfNumbers.get(0));
        System.out.println("Наибольшее число = " + listOfNumbers.get(listOfNumbers.size()-1));

    }

    private static void  divisionOfNnumbers39 (ArrayList<Integer> listOfNumbers) {

        System.out.print("Числа, которые делятся на 3 или на 9: ");

        for (Integer listOfNumber : listOfNumbers) {

            if (listOfNumber%9 == 0 | listOfNumber%3 == 0) System.out.print(listOfNumber + " ");

        }

    }

    private static void divisionOfNnumbers5and7(ArrayList<Integer> list) {

        System.out.print("Числа, которые делятся на 5 и на 7: ");

        for (Integer listOfNumber : list) {

            if (listOfNumber%5 == 0 & listOfNumber%7 == 0) System.out.print(listOfNumber + " ");

        }

    }

    private static void notContainSameNumbers (ArrayList<Integer> list) {







    }





}
