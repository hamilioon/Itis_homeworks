import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int c = 0;
        int j = 0;
        int kol = 0;
        double sum = 0;
        double middle_height = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во учеников");
        int n = scan.nextInt();
        int [] mass = new int[n];
        while (c < n){
            int x = scan.nextInt();
            mass[c] = x;
            sum = mass[c] + sum;
            c++;
        }
        middle_height = sum / n;
        System.out.println(middle_height);

        while (j < n){
            if (mass[j] > middle_height){
                kol++;
            }
            j++;

        }
        System.out.println("Средний рост учеников = " + middle_height);
        System.out.println("Кол-во учеников выше среднего роста = " + kol);




    }
}
