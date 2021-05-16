/*Итоговая задача № 3
Напишите программу, где пользователь вводит сначала количество строк n,
затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.
Пример для теста работы программы:

Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Itog3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число строк: ");
        int n = console.nextInt(); //Считываем число строк, введённое пользователм
        int max = 0; //Создаём переменную для количества символов в слове, содержащем максимальное количество различных символов
        String maxWord = ""; //Создаем переменную для слова, содержащего максимальное количество различных символов
        System.out.println("Введите " + n + " строк (-и):");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(console.next());
        }
        for (String word: strings) {                      //считаем количесвто уникальных символов в слове - элементе массива строк
            int count = (int) word.chars().distinct().count();
            if (max < count) {max = count; maxWord = word;}
        }

        System.out.println("Ответ: " + maxWord);

    }
}
