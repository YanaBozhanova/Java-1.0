import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x1 = console.nextInt();
        int x2 = console.nextInt();
        String calc = console.nextLine();
        switch (calc) {

            case " +":
                System.out.println(x1+x2);
                break;
            case " -":
                System.out.println(x1-x2);
                break;
            case " *":
                System.out.println(x1*x2);
                break;
            case " /":
                if (x2 != 0) System.out.println(x1/x2);
                else System.out.println("На ноль делить нельзя!");
                break;

        }


    }

}
