package algorithms.Homework1.homeworkOne;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 4, 7, 2, 1, 9};
        int result = 0;
        for (int element:numbers) {
            result = result + element*element;
        }
        //либо:
//        for (int i = 0; i < numbers.length; i++) {
//            result = result + numbers[i]*numbers[i];
//        }
        
        // Стримом тоже будет проходиться по каждому элементу, значит, тоже будет линейный обход
//        System.out.println(Arrays.stream(numbers).map(n -> n*n).sum());
        System.out.println(result);
    }
}
