import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int limit = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= limit; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("0'dan " + limit + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("0'dan " + limit + "'e kadar 3 ve 4'e tam bölünen sayı bulunmamaktadır.");
        }
    }
}
