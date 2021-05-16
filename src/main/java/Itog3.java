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


import java.util.Scanner;


public class Itog3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt(); //Считываем число строк, введённое пользователм
        String[] str = new String[n]; //Создаём массив размерносью п для слов, которые будет вводить пользователь
        //String word;
        int max = 0; //Создаём переменную для количества символов в слове, содержащем максимальное количество различных символов
        // Записываем
        for (int i = 0; i < str.length; i++) {
            str[i] = console.nextLine()
        }


        for (int i = 0; i < str.length ; i++) {
            char[] ch = str[i].toCharArray();
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i]!=ch[i+1]) count = count + 1;
            }
            if (max <= count) max = count;
        }
        System.out.println(max);





    }
}
