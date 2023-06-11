package algorithms.Homework5;

import java.util.Arrays;

public class GradeApp {
    public static void main(String[] args) {
        //У вас есть список из n элементов, которые представляют собой оценки студентов по математике.
        // Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки
        // Merge sort.
        //Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает новый список,
        // отсортированный в порядке убывания.
        //{3, 8, 1, 9, 4, 2, 7, 6, 5 };

        int[] grades = {3, 8, 1, 9, 4, 2, 7, 6, 5};
        divideSortAndMerge(grades);
        System.out.println(Arrays.toString(grades));

    }

    public static void divideSortAndMerge(int[] numbers) {
        int size = numbers.length;
        if (size == 1) {
            return;
        }
        int middle = size / 2;
        int[] leftNumbers = new int[middle];
        int[] rightNumbers = new int[size - middle];

        for (int i = 0; i < middle; i++) {
            leftNumbers[i] = numbers[i];
        }
        for (int i = 0; i < size-middle; i++) {
            rightNumbers[i] = numbers[i+middle];
        }
        divideSortAndMerge(leftNumbers);
        divideSortAndMerge(rightNumbers);
        merge(numbers, leftNumbers, rightNumbers);

    }

    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int mainArrayIndex = 0;
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

        while (leftArrayIndex < leftSize && rightArrayIndex < rightSize) {
            if (leftArray[leftArrayIndex] > rightArray[rightArrayIndex]) {
                array[mainArrayIndex] = leftArray[leftArrayIndex];
                mainArrayIndex++;
                leftArrayIndex++;

            } else {
                array[mainArrayIndex] = rightArray[rightArrayIndex];
                mainArrayIndex++;
                rightArrayIndex++;

            }
        }
        while (leftArrayIndex < leftSize){
            array[mainArrayIndex] = leftArray[leftArrayIndex];
            mainArrayIndex++;
            leftArrayIndex++;
        }
        while (rightArrayIndex < rightSize){
            array[mainArrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            mainArrayIndex++;
        }
    }
}