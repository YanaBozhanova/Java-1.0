import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите два числа:");

    Scanner console = new Scanner(System.in);

    String s = console.nextLine();
    //String s = Integer.toString(x);

    int y = console.nextInt();

    int x1 = Integer.parseInt(s);

    int resultmax = Math.max(y,  x1);
        System.out.println(resultmax);

       /* Вариант с введением дополнтельной переменной для конвертации в double
        int  resultmin = Math.min(y,  x1);
        double f = resultmin;
        System.out.println(f);*/
        double resultmin = Math.min(y,  x1);
        System.out.println(resultmin);

    }
}
