import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
/*Напишите программу, где пользователь должен ввести строку из слов,
разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.
Выполните следующие действия:
Выведите слова, состоящие только из латиницы.
Выведите количество этих слов.*/


public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите строку из слов, разделённых пробелами (на латинице и кириллице):");
        Scanner console = new Scanner (System.in);
        String s = console.nextLine();
        String[] result = s.split(" ");
        String[] afterresult = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            String st = result[i];
            boolean onlyLatinAlphabet = st.matches("^[a-zA-Z0-9]+$");
            if (onlyLatinAlphabet) {
                afterresult[i] = st;
            }

        }
        String[] itog = Arrays.stream(afterresult).filter(Objects::nonNull).toArray(String[]::new);
        for (int i = 0; i < itog.length; i++) {
            System.out.print(itog[i]+" ");
        }
        System.out.println();
        int l = itog.length;
        System.out.println(l);









        }

    }

