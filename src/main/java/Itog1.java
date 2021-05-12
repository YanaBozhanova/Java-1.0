/*Напишите программу конвертер валют.
 Программа должна переводить рубли в доллары по текущему курсу.
 Пользователь вводит текущий курс и количество рублей.
 Итоговое значение должно быть округлено до двух знаков после запятой.
 Пример для теста работы программы:
 Курс доллара: 67,55
 Количество рублей: 1000
 Итого: 14,80 долларов*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Itog1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Введите текущий курс доллара: ");
        BigDecimal dollar = console.nextBigDecimal();
        System.out.println("Введите количество рублей: ");
        BigDecimal rub = console.nextBigDecimal();
        System.out.println("Курс доллара: : " + dollar);
        System.out.println("Количество рублей: " + rub);
        BigDecimal result = rub.divide(dollar,2, RoundingMode.HALF_UP);
        System.out.println("Итого: " + result + " долларов");


    }
}
