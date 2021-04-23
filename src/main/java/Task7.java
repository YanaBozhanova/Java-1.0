import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int x;
        final int y;
        final int z;
        int[] a;
        try (Scanner console = new Scanner(System.in)) {
            x = 35;
            y = 1;
            z = 6;
            System.out.println("Определите размер массиве - введите целое число: ");
            int l = console.nextInt();
            a = new int[l];
            System.out.println("Спасибо!");
            System.out.println("Введиет элементы массива: ");
            for (int i = 0; i < a.length; i++) a[i] = console.nextInt();
        }
        System.out.println("Ваш массив: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Спасибо!");

        for (int i = 0; i < a.length; i++) {
            if ((a[i] == x) || (a[i] == y) || (a[i] == z)) System.out.println("Данное значение имеется в константах: "+ a[i]);

        }


    }}
