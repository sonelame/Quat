import java.util.Scanner;

public class Baitap2 {
    private static Scanner scanner = new Scanner(System.in);
    public static int DEC_10 = 10;

    public static void main(String[] args) {
        System.out.print("nhap so nguyen doung n = ");
        int n = scanner.nextInt();
        System.out.printf("tong cua cac chu so "
                + "của %d là: %d", n, totalDigitsOfNumber(n));
    }

    public static int totalDigitsOfNumber(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }
}