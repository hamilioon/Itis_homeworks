import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Введите кол-во натуральных чисел");
        int n = sp.nextInt();
        int c = 0;
        int max = 0;
        int minimax = 0;
        while (c < n) {
            int a = sp.nextInt();
            if (a > max) {
                minimax = max;
                max = a;
            }
            else if (a > minimax) {
                minimax = a;

            }
            c++;
        }
        System.out.println("Максимальное число - " + max );
        System.out.println("Следующее по величине - " + minimax );


    }

}

