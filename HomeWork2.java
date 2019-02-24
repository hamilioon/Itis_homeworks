import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int regume = 0;
        Scanner scan = new Scanner(System.in);
        double res = 1;
        double stepen = 0;
        double otv = 0;
        double x1 = 0;

        while (regume < 1) {
            stepen = 0;
            res = 1;
            if (otv != 0) {
                x1 = otv;
            } else {
                System.out.println("Первое число");
                x1 = scan.nextDouble();
            }

            System.out.println("Введите операцию");
            String op = scan.next();

            System.out.println("Второе число");
            double x2 = scan.nextDouble();

            if (op.equals("+")) {
                res = x1 + x2;
                System.out.println("Результат " + res);

            }

            if (op.equals("-")) {
                res = x1 - x2;
                System.out.println("Результат " + res);

            }

            if (op.equals("*")) {
                res = x1 * x2;
                System.out.println("Результат " + res);

            }

            if (op.equals("/")) {
                res = x1 / x2;
                System.out.println("Результат " + res);

            }

            if (op.equals("^")) {
                while (stepen < x2) {
                    res = res * x1;
                    stepen++;
                }
                System.out.println("Результат " + res);

            }


            System.out.println("Продолжить? ( 1 - да; 0 - нет)");
            int regum = scan.nextInt();
            if (regum < 1) {
                regume++;
            } else {
                System.out.println("Сохранить результат? (y - да; n - нет)");
                String save = scan.next();
                if (save.equals("y")) {
                    otv = res;
                    res = 1;

                } else {
                    otv = 0;


                }
            }

        }

    }
}
