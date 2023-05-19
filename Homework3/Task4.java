package algorithms.Homework3;


public class Task4 {
    private static int startIndex = 0;
    private static int endIndex;
    public static void main(String[] args) {
        //Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.

        checkTheStringForPalindrome("level");
        checkTheStringForPalindrome("frog");
        checkTheStringForPalindrome("label");
        checkTheStringForPalindrome("madam");
        checkTheStringForPalindrome("racecar");
        checkTheStringForPalindrome("mom");
        checkTheStringForPalindrome("radar");
        checkTheStringForPalindrome("swamp");
        checkTheStringForPalindrome("momanddom");
    }

    public static void checkTheStringForPalindrome(String word){
        if (word!=null || !word.equals("")) {
            char[] letters = word.toCharArray();
            if (endIndex == 0){
                endIndex = letters.length - 1;}
            if (startIndex == endIndex){
                System.out.printf("The word %s is a palindrome.\n", word);
                startIndex = 0;
                endIndex = 0;
                return;
            }
            if (Character.toString(letters[startIndex]).equals(Character.toString(letters[endIndex]))  && startIndex<endIndex) {
                startIndex ++;
                endIndex --;
                checkTheStringForPalindrome(word);
            } else {
                System.out.printf("The word %s is not a palindrome.\n", word);
                startIndex = 0;
                endIndex = 0;
            }
        }
    }
}
