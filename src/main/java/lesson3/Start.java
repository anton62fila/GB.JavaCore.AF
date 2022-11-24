/**
 * JavaCore.HW3
 * @ author Anton Filatov
 * @ version 24.11.2022
 */
/**
 * 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 * 2. Задача:
 * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
 которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * Не забываем про метод добавления фрукта в коробку.
 */

package lesson3;
import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Integer[] testArr = {1, 2, 3, 4};
        System.out.print("Первоначальное состояние массива arr:");
        System.out.println(Arrays.toString(testArr));
        SwapTwoArrayElements(testArr, 1, 2);
        System.out.print("Результат работы метода перестановки:");
        System.out.println(Arrays.toString(testArr));

        ArrayList<Integer> listArr = new ArrayList();
        convertArrayToArrayList(listArr, testArr);
        System.out.print("Результат работы метода конвертации массива в ArrayList:");
        System.out.println(listArr);

        System.out.println();

        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        System.out.println("Вес коробки №1: " + box1.getWeight());

        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println("Вес коробки №2: " + box2.getWeight());

        System.out.println("Результат работы метода compare() класса Box, параметры (пример: box1.compare(box2))");

        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");

        System.out.println("В коробке Box1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());

        Box box3 = new Box();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println("Вес коробки №3: " + box3.getWeight());

        System.out.println("В коробке Box3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());

        box1.shiftSingleItem(box3);

        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №1: " + box1.getWeight());

        try {
            box2.shiftSingleItem(box3);
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());

        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());

    }

    public static <T> void SwapTwoArrayElements(T[] modifiableArray, int elemNum1, int elemNum2) {
        T backupElement = modifiableArray[elemNum1];
        modifiableArray[elemNum1] = modifiableArray[elemNum2];
        modifiableArray[elemNum2] = backupElement;
    }

    public static <T> void convertArrayToArrayList(ArrayList<T> listArray, T[] convertedArray) {
        for (T elem : convertedArray) {
            listArray.add(elem);
        }
    }
}
