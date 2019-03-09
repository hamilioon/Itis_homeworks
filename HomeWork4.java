import java.util.Scanner;

public class MegaSortirovka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// кол-во элементов массива
        int c = 0; //для создания массива
        String[] arr = new String[n];

        //Cоздаём массив
        while (c < n) {
            String x = sc.next();
            arr[c] = x;
            c++;
        }

        //сортируем
        for (int j = 0; j < n - 1; j++) {
            int indexOfMax = 0;
            //поиск максимального
            for (int i = 0; i < n - j; i++) {
                if (arr[i].length() > arr[indexOfMax].length()) {
                    indexOfMax = i;
                }
            }
            //обмен
            String b = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - j];
            arr[n - 1 - j] = b;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
