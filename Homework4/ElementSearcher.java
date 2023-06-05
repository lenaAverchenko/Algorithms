package algorithms.Homework4;

import java.util.Arrays;

public class ElementSearcher {
    public static void main(String[] args) {
        /*
         *  1 уровень сложности: Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
         * который будет находиться на k-й позиции в конечном отсортированном массиве.
         * Массив 1 - 100 112 256 349 770
         * Массив 2 - 72 86 113 119 265 445 892
         * к = 7
         * Вывод : 256
         **/

        // если к - позиция (индекс), то по 7 индексу будет 8 элемент - это 265)
        int[] arrayOne = {100, 112, 256, 349, 770};
        int[] arrayTwo = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int[] finalArray = concatAndSort(arrayOne, arrayTwo);
        System.out.println("The final array is: " + Arrays.toString(finalArray));
        System.out.printf(("The element by the %d index in the final array: " + finalArray[k] + "\n"), k);
    }

    // тут будет линейная временная сложность
    // поскольку массивы уже отсортированы, то логично сравнивать элементы поочередно, и вставлять соответственно:
    // минимальный с минимальным: кто-то из них точно будет первым, и так далее, до конца каждого массива.
    // Так или иначе, придется перебрать все элементы, т.к. их нужно добавить все.
    public static int[] concatAndSort(int[] arr1, int[] arr2) {
        int lengthOfFirstArray = arr1.length;
        int lengthOfSecondArray = arr2.length;
        int i = 0;
        int j = 0;
        int indexFinal = 0;
        int[] finalArray = new int[lengthOfFirstArray + lengthOfSecondArray];
        while (indexFinal < (lengthOfFirstArray + lengthOfSecondArray)) {
            if (i < lengthOfFirstArray && j < lengthOfSecondArray) {
                if (arr1[i] == arr2[j]) {
                    finalArray[indexFinal] = arr1[i];
                    finalArray[indexFinal + 1] = arr2[j];
                    indexFinal = indexFinal + 2;
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    finalArray[indexFinal] = arr1[i];
                    i++;
                    indexFinal++;
                } else {
                    finalArray[indexFinal] = arr2[j];
                    j++;
                    indexFinal++;
                }
            } else if (i == lengthOfFirstArray && j < lengthOfSecondArray) {
                finalArray[indexFinal] = arr2[j];
                j++;
                indexFinal++;
            } else if (i < lengthOfFirstArray && j == lengthOfSecondArray) {
                finalArray[indexFinal] = arr1[i];
                i++;
                indexFinal++;
            }
        }
        return finalArray;
    }
}
