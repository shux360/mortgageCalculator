import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double anInterRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        double period = scanner.nextDouble();

        double temp = Math.pow(1 + anInterRate/1200,period*12);
        String mortgage = NumberFormat.getCurrencyInstance ().format(principal * (((anInterRate/1200) * (temp))/((temp) - 1)));


        System.out.print("Mortgage: "+ mortgage );
    }
}