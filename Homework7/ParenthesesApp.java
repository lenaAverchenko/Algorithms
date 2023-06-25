package algorithms.Homework7;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ParenthesesApp {
    //Последовательность ([{}]) является правильной, а последовательности ([)], {()]
    // правильными не являются. Докажите это используя стек!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your parentheses: ");
        String res = scanner.nextLine();
        while (!res.equals("Q")) {
            char[] resChars = res.toCharArray();
            Stack<Character> charsOfRes = new Stack<>();
            for (char c : resChars) {
                charsOfRes.add(c);
            }
            List<Character> opened = List.of('(', '{', '[');
            List<Character> closed = List.of(')', '}', ']');

            if (charsOfRes.empty()) {
                System.out.println("You haven't put any symbol to process");
                return;
            }
            for (int i = 0; i < resChars.length; i++) {
                if (!opened.contains(resChars[i]) && !closed.contains(resChars[i])) {
                    System.out.println("Wrong symbols in the sequence");
                    return;
                }
            }
            Stack<Character> tempVal = new Stack<>();
            char currentValue = ' ';
            while (!charsOfRes.empty()) {
                if (!charsOfRes.empty()) {
                    currentValue = charsOfRes.pop();
                }
                if (closed.contains(currentValue)) {
                    tempVal.add(currentValue);
                } else if (opened.contains(currentValue) && !tempVal.empty()) {
                    char valToCompare = tempVal.pop();
                    int idxOfValToCompare = closed.indexOf(valToCompare);
                    if (!opened.get(idxOfValToCompare).equals(currentValue)) {
                        System.out.println("Wrong sequence");
                        return;
                    }
                }
            }
            if (charsOfRes.empty()) {
                System.out.println("The sequence is right");
            }
            System.out.println("Write your parentheses: ");
            res = scanner.nextLine();
        }
    }
}
