/*Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
Ответ: “Заархивированный вирус”.
У пользователя есть 3 попытки, чтобы отгадать загадку.
Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
Если на 2 и 3, вывести “Подсказка уже недоступна”.
Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
*/

import java.util.Scanner;

public class Itog4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Есть три попытки, чтобы решить эту загадку!");
        String answer;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ответ: ");
        answer = console.nextLine();
        if (answer.equals("Заархивированный вирус")) System.out.println("Правильно!");
        else if (answer.equals("Подсказка")) {
            System.out.println("Запакованная вредоносная компьютерная программа");
            System.out.println("У тебя всего одна попытка!");
            System.out.println("Введи ответ: ");
            String firstanswer = console.nextLine();
            if (firstanswer.equals("Заархивированный вирус")) System.out.println("Правильно!");
            else System.out.println("Обидно, приходи в другой раз");
        }
        else {
            System.out.println("Подумай еще! У тебя осталось 2 попытки!");
            System.out.println("Введи ответ: ");
            String secondanswer = console.nextLine();
            if (secondanswer.equals("Заархивированный вирус")) System.out.println("Правильно!");
            else {
                System.out.println("Подумай еще! У тебя осталась 1 попытка!");
                String thirdanswer = console.nextLine();
                if (thirdanswer.equals("Заархивированный вирус")) System.out.println("Правильно!");
                else System.out.println("Обидно, приходи в другой раз");
            }

        }





        /*for (int i = 1; i <= 3; i++) {
            if (exit) break;
            System.out.println("Введите ответ: ");
            answer = console.next();
            switch (answer) {
                case "Заархивированный вирус":
                    System.out.println("Правильно!");
                    exit = true;
                    break;
                case "Подсказка":
                    System.out.println("Фиг знает, как тебе помочь, друг)");
                    exit = true;
                    break;
                default: System.out.println("Подумай еще!");

            }
        }*/

    }
}




