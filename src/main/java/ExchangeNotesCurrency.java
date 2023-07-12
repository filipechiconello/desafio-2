import java.util.Scanner;

public class ExchangeNotesCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();
        int valueInteger = (int) value;
        int cents = (int) Math.round((value - valueInteger) * 100);

        int[] grades = {100, 50, 20, 10, 5, 2};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int note : grades) {
            int quantityNotes = valueInteger / note;
            System.out.printf("%d nota(s) de R$ %.2f\n", quantityNotes, note);
            valueInteger %= note;
        }

        System.out.println("MOEDAS:");
        for (int coin : coins) {
            int quantityCoins = cents / coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantityCoins, (double) coin / 100);
            cents %= coin;
        }
    }
}
