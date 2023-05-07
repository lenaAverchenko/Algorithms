package algorithms.Homework1.homeworkOne;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        //добавила лишнюю 1 просто для того, чтобы в поиске можно было убедиться, что найден первый элемент с конца
        int[] numbers = {3, 6, 1, 4, 7, 2, 1, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number you are looking for: ");
        int numberToSearch = scanner.nextInt();
        boolean isFound = false;
        for (int i = (numbers.length-1); i >=0 ; i--) {
            if (numbers[i] == numberToSearch){
                isFound = true;
                System.out.printf(("The first found index of the number \"%d\" (with the aid of reversed linear search) is " + i + "\n"), numberToSearch);
                return;
            }
        }
        if (!isFound){
            System.out.println("The number is not found in the existing array!");
        }
    }
}
