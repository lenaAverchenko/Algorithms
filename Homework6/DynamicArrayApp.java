package algorithms.Homework6;

import java.util.Arrays;
import java.util.function.BiFunction;

public class DynamicArrayApp {
    public static void main(String[] args) {
        //b. Рассмотрите задачу динамического увеличения массива. Реализуйте функцию, которая принимает
        // на вход массив и число элементов, и возвращает
        // новый массив, который содержит все элементы исходного массива и заданное число новых элементов.

        // реализация 1
        BiFunction<int[], Integer, int[]> changeArray = (int[] ints, Integer num) -> {
            int[] newArray = new int[ints.length + num];
            for (int i = 0; i < ints.length; i++) {
                newArray[i] = ints[i];
            }
            return newArray;
        };

        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 8, 55, 10};
        System.out.println("Result of copyAndEnlargeArray() method: " +
                Arrays.toString(copyAndEnlargeArray(numbers, 5)));
        System.out.println("________________________________");
        System.out.println("Result of changeArray function: " +
                Arrays.toString(changeArray.apply(numbers, 5)));
    }

    // реализация 2 понятно, что в таком массиве у нас по дефолту пустые ячейки = 0, ну а их можно заполнить
    public static int[] copyAndEnlargeArray(int[] array, int numberOfNewElements) {
        int[] newArray = new int[array.length + numberOfNewElements];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
