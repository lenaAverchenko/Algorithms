package algorithms.Homework7;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SymmetryApp {
    // Дан односвязный список. Написать функцию или блок схему, определяющую, образуют ли его элементы симметричную
    // последовательность. Для решения задачи использовать стек и очередь. Функция будет возвращать значение true,
    // если список является симметричным, false – в противном случае.
    // По определению пустой список является симметричным. Поэтому, если список пуст, то возвращаем значение true.
    // Для проверки симметричности списка нужно проверить на равенство все пары элементов, равноотстоящих от середины
    // списка. Каждая пара содержит один элемент из первой половины списка и один – из второй. Элементы первой
    // половины списка последовательно заносятся в очередь, второй половины в стек. Если количество элементов
    // списка будет нечетным, то серединный элемент будет симметричен сам себе и не будет помещен ни в очередь,
    // ни в стек.

    public static void main(String[] args) {
        char[] letters = getSequenceOfElements();
        System.out.println(isSymmetrical(letters));
    }

    public static char[] getSequenceOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your String to process: ");
        String usersStr = scanner.nextLine();
        return usersStr.toCharArray();
    }

    public static boolean isSymmetrical(char[] chars) {
        boolean checked = false;
        int middleIdx;
        Stack<Character> tailPart = new Stack<>();
        Queue<Character> headPart = new ArrayDeque<>();
        if (chars.length == 0) {
            checked = true;
            System.out.println("There is nothing to process");
        } else {
            if (chars.length % 2 == 0) {
                middleIdx = chars.length / 2;
                divideCharArray(chars, middleIdx, middleIdx, tailPart, headPart);
            } else {
                middleIdx = chars.length / 2;
                divideCharArray(chars, middleIdx, middleIdx + 1, tailPart, headPart);
            }

            while (!headPart.isEmpty()) {
                if (headPart.poll().equals(tailPart.pop())) {
                    checked = true;
                    continue;
                } else {
                    checked = false;
                    System.out.println("The string is not symmetrical");
                }
            }
        }
        return checked;
    }

    public static void divideCharArray(char[] chars, int middleIdxHead, int middleIdxTail, Stack<Character> tailPart, Queue<Character> headPart) {
        for (int i = 0; i < middleIdxHead; i++) {
            headPart.add(chars[i]);
        }
        for (int i = middleIdxTail; i < chars.length; i++) {
            tailPart.add(chars[i]);
        }
    }
}
