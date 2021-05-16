//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число строк матрицы: ");
        int a = console.nextInt();
        System.out.println("Введите число столбцов матрицы: ");
        int b = console.nextInt();
        int[][] matriza = new int[a][b];
        System.out.println("Введите " + a*b + " чисел (-ла) для заполнения матрицы данными: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matriza[i][j] = console.nextInt();

            }

        }
        System.out.println("Первая строка матрицы, умноженная на 3: ");
        for (int i = 0; i < 1 ; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matriza[i][j]*3+" ");
            }

        }

    }
}
