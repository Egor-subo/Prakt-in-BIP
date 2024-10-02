import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        int Maxnumber;

        int sum = 0;
        int b;
        int c;
        int max;

        for(int i = 0;i <= numbers.length ;i++){
            numbers[i] = random.nextInt(10, 99);

            b = numbers[i] % 10;
            c = (numbers[i]/10) % 10;
            max = b + c;
            Math.max(numbers);
            System.out.println( "Рандомные числа: " + numbers + " Сумма цифр чисел: " + (b+c) + " Максимальная сумма цифр");

        }

    }
}