package algorithms.Homework3;

public class Task1 {

    private static int i = 1;

    public static void main(String[] args) {
//        Дано натуральное число N. Выведите слово YES, если число N является точной степенью
//        двойки, или слово NO в противном случае.
//                Операцией возведения в степень пользоваться нельзя!

//        Ввод: 8
//        Вывод: YES
//        Ввод: 3
//        Вывод: NO

        checkTheNumberIsPowerOfTwo(64);
        checkTheNumberIsPowerOfTwo(16);
        checkTheNumberIsPowerOfTwo(8);
        checkTheNumberIsPowerOfTwo(0);
        checkTheNumberIsPowerOfTwo(3);

        System.out.println("___________________");
        checkTheNumberIsPowerOfTwoByMultiplying(64);
        checkTheNumberIsPowerOfTwoByMultiplying(16);
        checkTheNumberIsPowerOfTwoByMultiplying(8);
        checkTheNumberIsPowerOfTwoByMultiplying(0);
        checkTheNumberIsPowerOfTwoByMultiplying(3);
    }

    //Option 1

    public static void checkTheNumberIsPowerOfTwoByMultiplying(int n){
        i = i*2;
        if (n == i){
            System.out.println("YES");
            i = 1;
        } else if (i < n && (n % 2) ==0) {
            checkTheNumberIsPowerOfTwoByMultiplying(n);
        } else {
            System.out.println("NO");
        }
    }

    //Option 2

    public static void checkTheNumberIsPowerOfTwo(int n){
        if (n == 2){
            System.out.println("YES");
        } else if (n % 2 == 0 && n!=0){
            n = n /2;
            checkTheNumberIsPowerOfTwo(n);
        } else {
            System.out.println("NO");
        }
    }
}
