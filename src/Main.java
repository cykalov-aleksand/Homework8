import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------Задание 1-----------------");
        int[] intNumbers = new int[3];
        intNumbers[0] = 1;
        intNumbers[1] = 2;
        intNumbers[2] = 3;
        float[] floatNumbers = {1.57f, 7.654f, 9.986f};
        short[] shortNumbers = {0, 123, 8374, 32723, -1289};
        System.out.println("Объявлены 3 массива: ");
        System.out.println("Массив типа int intNumbers[" + intNumbers.length + "] = " + Arrays.toString(intNumbers) +
                "\nМассив типа float floatNumbers[" + floatNumbers.length + "] = " + Arrays.toString(floatNumbers) +
                "\nМассив типа short shortNumbers[" + shortNumbers.length + "] = " + Arrays.toString(shortNumbers));

        System.out.println("\n---------------Задание 2-----------------");
        System.out.print("Элементы массива типа int intNumbers[" + intNumbers.length + "]: ");
        for (byte number = 0; number < intNumbers.length; number++) {
            if (number == intNumbers.length - 1) {
                System.out.println(intNumbers[intNumbers.length - 1]);
                break;
            }
            System.out.print(intNumbers[number] + ", ");
        }
        System.out.print("Элементы массива типа float floatNumbers[" + floatNumbers.length + "]: ");
        for (byte number = 0; number < floatNumbers.length; number++) {
            if (number == floatNumbers.length - 1) {
                System.out.println(floatNumbers[floatNumbers.length - 1]);
                break;
            }
            System.out.print(floatNumbers[number] + ", ");
        }
        System.out.print("Элементы массива типа short shortNumbers[" + shortNumbers.length + "]: ");
        for (int number = 0; number < shortNumbers.length; number++) {
            if (number == shortNumbers.length - 1) {
                System.out.println(shortNumbers[shortNumbers.length - 1]);
                break;
            }
            System.out.print(shortNumbers[number] + ", ");
        }
        System.out.println("\n---------------Задание 3-----------------");
        System.out.print("Элементы массива типа int в обратном порядке intNumbers[" + intNumbers.length + "]: ");
        for (byte number = (byte)(intNumbers.length - 1); number >= 0; number--) {
            if (number == 0) {
                System.out.println(intNumbers[number]);
                break;
            }
            System.out.print(intNumbers[number] + ", ");
        }
        System.out.print("Элементы массива типа float в обратном порядке floatNumbers[" + floatNumbers.length + "]: ");
        for (byte number = (byte)(floatNumbers.length - 1); number >= 0; number--) {
            if (number == 0) {
                System.out.println(floatNumbers[number]);
                break;
            }
            System.out.print(floatNumbers[number] + ", ");
        }
        System.out.print("Элементы массива типа short в обратном порядке shortNumbers[" + shortNumbers.length + "]: ");
        for (int numbers = shortNumbers.length - 1; numbers >= 0; numbers--) {
            if (numbers == 0) {
                System.out.println(shortNumbers[numbers]);
                break;
            }
            System.out.print(shortNumbers[numbers] + ", ");
        }
        System.out.println("\n---------------Задание 4-----------------");
        System.out.println("В массиве intNumbers[" + intNumbers.length + "] = " + Arrays.toString(intNumbers) + " в нечётных числах добавлена 1");
        for (byte number = 0; number < intNumbers.length; number++) {
            if (intNumbers[number] % 2 != 0) {
                intNumbers[number] += 1;
            }
        }
        System.out.println("в результате получили массив intNumbers[" + intNumbers.length + "]=" + Arrays.toString(intNumbers));
    }
}

