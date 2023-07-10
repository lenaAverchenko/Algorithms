package algorithms.homework9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // 1) Big(O) {3,5,1,9,9,4}
        // Если мы сначала сортируем массив, методом Bubble Sort - O(n^2)
        // Либо Quick Sort - O(n*log(n))

        // А затем составляем число из отсортированного массива простым проходом - O(n)
        // По итогу, получаем:
        // 1) O(n^2 + n) = O(n^2)
        // 2) O(n*log(n) + n) = O(n*log(n))

        // Может быть также рекурсивное нахождение максимального числа и выписывание их поочередно, с пометкой индекса, чтобы не
        // переписывать каждый раз массив и не занимать место. И это будет квадратичная сложность, т.к. каждый раз проходиться
        // по всему массиву.
        // Либо пожертвовать памятью и перезаписывать массив, удаляя из него каждый раз самый большой элемент. И тогда у нас
        // будет логарифмическая сложность.

        // Жадный алгоритм - это вся наша жизнь:
        // 1) стремление к повышению на работе;
        // 2) походы по магазинам с акциями и попытка купить "3 продукта по цене 2", и так повторяется постоянно, пока
        // не будут сделаны все покупки
        // 3) получение медали в школе / красного диплома в универе - на максимум учиться на каждом этапе.
        // буквально, все и везде можно "подогнать" под задачу этого алгоритма

        List<Item> items = Arrays.asList(
                new Item(2, 94),
                new Item(3, 86),
                new Item(5, 35),
                new Item(7, 99));
        //Суммарный вес не превышает 10 кг, а суммарная стоимость - максимальна
        double tempVal = 0;
        for (Item el : items) {
            tempVal = el.getPrice() * 1.0 / el.getWeight();
            el.setValue(tempVal);
        }
        List<Item> values = items.stream().sorted(Comparator.comparing(Item::getValue)).toList();

        int currentWeight = 0;
        List<Item> optimalItems = new ArrayList<>();
        for (int i = values.size() - 1; i >= 0; i--) {
            if (currentWeight < 10) {
                if (values.get(i).getWeight() <= 10 - currentWeight) {
                    optimalItems.add(values.get(i));
                    currentWeight = currentWeight + values.get(i).getWeight();
                }
            }
        }
        System.out.println("Optimal items are: " + optimalItems);
    }
}
