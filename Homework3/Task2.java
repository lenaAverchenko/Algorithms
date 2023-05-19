package algorithms.Homework3;

public class Task2 {

    private  static int sum = 0;
    public static void main(String[] args) {
        //Дано натуральное число N. Вычислите сумму его цифр.
        //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        //Ввод: 179
        //Вывод: 17

        getSumOfNumbers(179);
        getSumOfNumbers(25);
        getSumOfNumbers(1263);
        getSumOfNumbers(2);
        getSumOfNumbers(0);
    }

    public static void getSumOfNumbers(int number){
        if (number/10 ==0){
            sum +=number;
            System.out.println("The sum of the consisting numbers: " + sum);
            sum = 0;
            return;
        }
        int currentNumber = number % 10;
        sum +=currentNumber;
        number = number/10;
        getSumOfNumbers(number);
    }
}
