import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        double x = (double)(a + b + c) / 3;
        System.out.println(x);
        int y = (int) x / 2;
        if (y>3) System.out.println("Программа выполнена корректно");


    }

    }

