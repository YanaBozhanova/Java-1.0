import org.jetbrains.annotations.NotNull;
/*Напишите программу, заполняющую массив из 15 элементов
рандомными значениями в диапазоне от -20 до 20. Далее:
Выведите максимальный и минимальный элемент массива.
Из максимального и минимального значения выведите наибольшее по модулю.*/

public class Task14 {
    public static void main(String @NotNull [] args) {
        //Вводим значения для границ случайных чисел
        int max = 21;
        int min = -20;
        //Создаём пустой массив из 15 элементов
        int[] array = new int[15];
        //Заполняем массив случайными значениями в указанном диапазон и выводим его на экран
        for (int i = 0; i < array.length; i++) {
            int x = (int)(Math.random()*(max - min) + min);
            array[i] = x;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Находим максимальный элемент массива

        int maxar=array[0];
        for (int i = 0; i < array.length; i++) {
            maxar = Math.max(array[i],maxar);
        }
        System.out.println("Максимальный элемент в массиве: " + maxar);
        //Находим минимальный элемент массива
        int minar = array[0];
        for (int i = 0; i < array.length; i++) {
            minar = Math.min(minar, array[i]);

        }
        System.out.println("Минимальный элемент в массиве: " + minar);

        //Находим модули макс. и мин. значений элементов и выводим наибольшее по модулю из нх

        int min1 = Math.abs(minar);
        int max1 = Math.abs(maxar);
        if (min1 > max1) System.out.println("Из максимального и минимального значения наибольшее по модулю: " + minar);
        else if (min1 == max1) System.out.println("Значения по модулю максимального и минимального элементов равны: " + minar);
        else System.out.println("Из максимального и минимального значения наибольшее по модулю: " + maxar);
    }


}











