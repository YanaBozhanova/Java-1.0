import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int n = console.nextInt();
        int sum = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Числа от 1 до " + n + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (!(array[i]%2==0)) {sum = sum + array[i];}
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна " + sum);
    }
}
