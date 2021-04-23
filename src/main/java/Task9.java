import java.text.DecimalFormat;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int l = console.nextInt();
        double[] array = new double[l];
        System.out.println("Введите " + l + " вещественных чисел (-ла): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextDouble();
        }
        double sum = 0.0d;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
double arif = (double) sum/l;
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("Среднее арифметическое введённых Вами чисел равно: " + format.format(arif));
        System.out.println("Ваши числа, умноженные на " + format.format(arif) + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(format.format(array[i] * arif) + " ");
        }
    }


}
