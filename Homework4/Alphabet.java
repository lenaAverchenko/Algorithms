package algorithms.Homework4;

public class Alphabet {
    public static void main(String[] args) {
        //Расставьте в алфавитном порядке буквы. Разрешается использование техники Разделяй и властвуй.
        // Полученные данные напечатайте.
        //👉👉👉  На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
        //На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)
        String initialString = "poiuytrewqlkjhgfdsamnbvcxz";
        char[] letters = initialString.toCharArray();
        getLettersInOrderQuickSort(letters, 0, letters.length - 1);
        System.out.println(new String(letters).toUpperCase());
    }

    public static void getLettersInOrderQuickSort(char[] letters, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int pickedIndex = (firstIndex + lastIndex) / 2;
            int currentLowerIndex = firstIndex;
            int currentHigherIndex = lastIndex;
            char pickedElement = letters[pickedIndex];
            while (currentLowerIndex < currentHigherIndex) {
                while (letters[currentHigherIndex] > pickedElement) {
                    currentHigherIndex--;
                }
                while (letters[currentLowerIndex] < pickedElement) {
                    currentLowerIndex++;
                }
                if (currentLowerIndex <= currentHigherIndex) {
                    if (currentLowerIndex < currentHigherIndex) {
                        char currentElement = letters[currentLowerIndex];
                        letters[currentLowerIndex] = letters[currentHigherIndex];
                        letters[currentHigherIndex] = currentElement;
                    }
                    currentLowerIndex++;
                    currentHigherIndex--;
                }
            }
            if (currentLowerIndex > currentHigherIndex) {
                int currentIndex = currentLowerIndex;
                currentLowerIndex = currentHigherIndex;
                currentHigherIndex = currentIndex;
            }
            if (firstIndex < currentLowerIndex) {
                getLettersInOrderQuickSort(letters, firstIndex, currentLowerIndex);
            }
            if (lastIndex > currentHigherIndex) {
                getLettersInOrderQuickSort(letters, currentHigherIndex, lastIndex);
            }
        }
    }
}