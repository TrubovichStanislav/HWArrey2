import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] expensesMonth = generateRandomArray();
        int expensesSum = 0;
        for (int expensesDay : expensesMonth) {
            expensesSum += expensesDay;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей \n", expensesSum);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] expensesMonth = generateRandomArray();
        int expensesDayMin = expensesMonth[0];
        int expensesDayMax = expensesMonth[0];
        for (int expensesDay : expensesMonth) {
            if (expensesDay < expensesDayMin) {
                expensesDayMin = expensesDay;
            } else if (expensesDay > expensesDayMax) {
                expensesDayMax = expensesDay;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", expensesDayMin, expensesDayMax);
        System.out.println();
        task2_2(expensesMonth);
    }

    public static void task2_2(int[] expensesMonth) {
        System.out.println("Задача2 второй вариант решения ");
        Arrays.sort(expensesMonth);
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", expensesMonth[0], expensesMonth[expensesMonth.length - 1]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача3");
        int[] expensesMonth = generateRandomArray();
        double expensesSum = 0;
        for (double expensesDay : expensesMonth) {
            expensesSum += expensesDay;
        }
        double expensesDayMiddle = expensesSum / expensesMonth.length;
        int rub = (int) expensesDayMiddle;
        int kop = (int) Math.round((expensesDayMiddle - rub) * 100);
        System.out.printf("Средняя сумма трат за месяц составила %d рублей ,%d коппеек \n", rub, kop);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arreyLength = reverseFullName.length;
        for (int i = 0; i < arreyLength / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[arreyLength - 1 - i];
            reverseFullName[arreyLength - 1 - i] = temp;
        }
        for (char letter : reverseFullName) {
            System.out.print(letter);
        }
        System.out.println();
        System.out.println();
        task4_2();
    }

    public static void task4_2() {
        System.out.println("Задача4 второй вариант решения ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}