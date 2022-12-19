/**
 * JavaCore.HW5
 * @ author Anton Filatov
 * @ version 18.12.2022
 */
/**
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 * Структура csv файла:
 * Строка заголовок с набором столбцов
 * Набор строк с целочисленными значениями
 * Разделитель между столбцами - символ точка с запятой (;)
 */

package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AppData appData = new AppData();
        appData.load("lesson5.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("lesson5-1.txt");
    }
}