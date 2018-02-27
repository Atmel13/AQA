import java.util.*;

public class Main {

    public static void main(String[] args) {

        int howManyNumbersToCount = 5;

        welcomeUser(); //задание 1
        displayNameInReverseOrder("Евгений"); //задание 2
        displayRandomNumbers(25); //задание 3
        isEnteredStringEqualTo("Pass4W0rd"); //задание 4
        getResultsOfEnteredNumbers(howManyNumbersToCount); //задание 5

        //Для 6-го задания
        ArrayList<Integer> list = new ArrayList();
        System.out.println("Введите " + howManyNumbersToCount + " чисел. Каждое число с новой строки");

        for (int i = 0; i < howManyNumbersToCount; i++) {
            Scanner scan = new Scanner(System.in);
            String enteredText = scan.next();
            int number = Integer.parseInt(enteredText);
            list.add(number);
        }


        findEvenAndOddNumbers(list); //задание 6.1
        findMinMax(list); //задание 6.2
        divisionOfNumbers39(list); //задание 6.3
        divisionOfNumbers5and7(list); //задание 6.4
        noEqualNumbers(list);
        luckyNumbers(list); //задание 6.6

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

        System.out.println("Пункт 3 выполнен.");

    }

    private static void isEnteredStringEqualTo(String password) {

        System.out.println("Please enter correct password to activate the program and press \"Enter\" button");

        Scanner scan = new Scanner(System.in);
        String enteredPassword = scan.next();

        if (password.equals(enteredPassword)) System.out.println("Пароли совпадают!");
        else System.out.println("Пароли НЕ совпадают!");

        System.out.println("Пункт 4 выполнен.");

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

        System.out.println("Пункт 5 выполнен.");

    }

    private static void findEvenAndOddNumbers(ArrayList<Integer> listOfNumbers) {

        System.out.print("Четные числа: ");

        for (int filledNumber : listOfNumbers) {

            if (filledNumber % 2 == 0) System.out.print(filledNumber + " ");

        }

        System.out.print("\n" + "Нечетные числа: ");

        for (int filledNumber : listOfNumbers) {

            if (filledNumber % 2 != 0) System.out.print(filledNumber + " ");

        }

        System.out.println("\n" + "Пункт 6.1 выполнен.");

    }

    private static void findMinMax(ArrayList<Integer> listOfNumbers) {

        Collections.sort(listOfNumbers);

        System.out.println("Наименьшее число = " + listOfNumbers.get(0));
        System.out.println("Наибольшее число = " + listOfNumbers.get(listOfNumbers.size() - 1));

        System.out.println("Пункт 6.2 выполнен.");

    }

    private static void divisionOfNumbers39(ArrayList<Integer> listOfNumbers) {

        System.out.print("Числа, которые делятся на 3 или на 9: ");

        for (Integer listOfNumber : listOfNumbers) {

            if (listOfNumber % 9 == 0 | listOfNumber % 3 == 0) System.out.print(listOfNumber + " ");

        }

        System.out.println("\n" + "Пункт 6.3 выполнен.");

    }

    private static void divisionOfNumbers5and7(ArrayList<Integer> list) {

        System.out.print("Числа, которые делятся на 5 и на 7: ");

        for (Integer listOfNumber : list) {

            if (listOfNumber % 5 == 0 & listOfNumber % 7 == 0) System.out.print(listOfNumber + " ");

        }

        System.out.println("\n" + "Пункт 6.4 выполнен.");

    }

    private static void noEqualNumbers(ArrayList<Integer> list) {

        for (int myNum : list) {

            String numContainer = Integer.toString(myNum);
            int[] myNumbers = new int[numContainer.length()];
            HashSet myNumbersSet = new HashSet();

            if (myNumbers.length == 3) {

                for (int i = 0; i < myNumbers.length; i++) {
                    myNumbers[i] = Integer.parseInt(String.valueOf(numContainer.charAt(i)));
                    myNumbersSet.add(myNumbers[i]);
                }
                
            }

            if (myNumbers.length == myNumbersSet.size())
                System.out.println("Это трехзначное число состоит из уникальных цифр. Число = " + myNum);


        }

        System.out.println("Пункт 6.5 выполнен.");

    }

    private static void luckyNumbers(ArrayList<Integer> list) {

        for (int myNum : list) {

            String numContainer = Integer.toString(myNum);
            int[] myNumbers = new int[numContainer.length()];

            for (int i = 0; i < myNumbers.length; i++) {
                myNumbers[i] = Integer.parseInt(String.valueOf(numContainer.charAt(i)));
            }

            //System.out.println("Длина массива = " + myNumbers.length);
            //System.out.println("Состав массива = " + Arrays.toString(myNumbers));

            if (myNumbers.length % 2 != 0) {

                System.out.println("Введеное число = " + myNum + ", содержит нечетное кол-во цифр. " +
                        "Не подходит для дальнейшего расчета счастливого числа");
            } else {

                int part1 = 0;
                int part2 = 0;

                for (int i = 0; i < myNumbers.length / 2; i++) {

                    part1 += myNumbers[i];

                    //System.out.println("myNumbers = " + myNumbers[i]);
                }

                for (int i = myNumbers.length / 2; i < myNumbers.length; i++) {

                    part2 += myNumbers[i];

                    //System.out.println("part2 = " + part2);
                }

                if (part1 == part2) System.out.println("Найдено счастливое число = " + myNum);
                else System.out.println("Число " + myNum + " не является счастливым.");
            }
        }

        System.out.println("Пункт 6.6 выполнен.");
    }


}
