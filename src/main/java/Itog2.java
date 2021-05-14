/*Итоговая задача №2
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.
Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0*/


import java.util.Scanner;


public class Itog2 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String str = console.nextLine();
        char[] ch = str.toCharArray();
        char operation = ch[1];
        int result = 0;
        int a = Character.getNumericValue(ch[0]);
        int b = Character.getNumericValue(ch[2]);
        int c = Character.getNumericValue(ch[4]);

        if (ch[0] == 'x') {
            if (operation == '+') {
                result = c - b;
            }
            else if (operation == '-') {
                result = c + b;
            }
        }
        if (ch[2] == 'x') {
            if (operation == '+') {
                result = c - a;
            }
            else if (operation == '-') {
                result = a - c;
            }
        }
        if (ch[4] == 'x') {
            if (operation == '+') {
                result = a + b;
            }
            else if (operation == '-') {
                result = a - b;
            }
        }
        System.out.println("x = " + result);
    }
}

