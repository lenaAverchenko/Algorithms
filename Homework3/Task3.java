package algorithms.Homework3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    private static List<Integer> numbers = new ArrayList<>();
    private static int i = 0;
    private static int counter = 0;

    public static void main(String[] args) {
        //Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
        getFibonacciNumbers(4);
        getFibonacciNumbers(10);
    }

    public static void getFibonacciNumbers(int n){
        numbers.add(i);
        if (i>n){
            System.out.println(numbers);
            numbers = new ArrayList<>();
            counter = 0;
            i = 0;
        } else if (i == 0){
            i = i+1;
            counter++;
            getFibonacciNumbers(n);
        } else {
            i = numbers.get(counter-1) + numbers.get(counter);
            counter ++;
            getFibonacciNumbers(n);
        }
    }
}
