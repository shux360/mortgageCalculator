import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal;
        double anInterRate;
        double period;

        do {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();

            if((principal < 1000) || (principal > 1000000))
                System.out.println("Enter a number between 1,000 and 1,000,000");
        }
        while ((principal < 1000) || (principal > 1000000));


        do {
            System.out.print("Annual Interest Rate: ");
            anInterRate = scanner.nextDouble();

            if((anInterRate <= 0) || (anInterRate > 30))
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        while ((anInterRate <= 0) || (anInterRate > 30));


        do {
            System.out.print("Period (Years): ");
            period = scanner.nextDouble();

            if((period < 1) || (period > 30))
                System.out.println("Enter a value between 1 and 30");
        }
        while ((period < 1) || (period > 30));


        double temp = Math.pow(1 + anInterRate/1200,period*12);
        String mortgage = NumberFormat.getCurrencyInstance ().format(principal * (((anInterRate/1200) * (temp))/((temp) - 1)));


        System.out.print("Mortgage: "+ mortgage );
    }
}