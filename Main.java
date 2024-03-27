public class Main {

    public static void main(String[] args) {
        // Три слова
        printThreeWords();

        // Суммы двух чисел
        checkSumSign();

        // Цвет в зависимости от значения переменной value
        printColor(-5);
        printColor(50);
        printColor(150);

        // Сравнение двух чисел a и b
        compareNumbers();

        // Сумма двух чисел в диапазоне от 10 до 20
        System.out.println(sumRange(5, 10));
        System.out.println(sumRange(15, 6));

        // Положительное и отрицательное число
        checkNumber(2);
        checkNumber(-3);
        checkNumber(0);

        // true, если -, и false, если + или 0
        System.out.println(negative(-5));
        System.out.println(negative(0));
        System.out.println(negative(5));

        // Печатает строку n-раз
        printStringN("Hello", 4);

        // Високосный год
        System.out.println(leapYear(2020));
        System.out.println(leapYear(1900));

        // Инвертирование массива (0=1 и 1=0)
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
        printArray(array);

        invertArray(array);

        System.out.print("Измененный массив: ");
        printArray(array);


        // Заполнение массива от 1 до 100
        int[] array2 = new int[100];
        fillArray(array2);
        printArray(array2);

        // <6*2
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplySix(array3);
        printArray(array3);

        // Заполнение диагонали единицами
        fillOnes();

        // Создание массива длиной len, каждая ячейка которого равна initialValue
        //int[] newArray = lenArr(5, 10);
        printArr(lenArr(9, 24));

    }



    // Метод, печатающий три слова
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Метод, проверяющий суммы двух чисел (+/-)
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Метод, выводящий цвет в зависимости от значения переменной value
    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Метод для сравнения двух чисел a и b
    public static void compareNumbers() {
        int a = 10;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Метод для проверки, лежит ли сумма двух чисел в диапазоне от 10 до 20
    public static boolean sumRange(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Метод для проверки, положительного и отрицательного числа
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // Метод, который возвращает true, если число отрицательное, и false, если положительное или равно нулю
    public static boolean negative(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Метод, который печатает строку указанное количество раз
    public static void printStringN(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // Метод для определения високосного года
    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    // Метод для инвертирования массива (0=1 и 1=0)
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    // Вывод массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Метод для заполнения массива от 1 до 100
    public static void fillArray(int[] array2) {
        for (int i = 0; i < 100; i++) {
            array2[i] = i + 1;
        }
    }

    // Метод для умножения чисел меньших 6 на 2
    public static void multiplySix(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
    }

    // Метод, который заполняет диагональные элементы единицами
    public static void fillOnes() {
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для создания массива длиной len, каждая ячейка которого равна initialValue
    public static int[] lenArr(int len, int initialValue) {
        int[] arr2 = new int[len];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = initialValue;
        }
        return arr2;
    }

    public static void printArr(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}