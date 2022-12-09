package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {
    /**
     * Given a loan each month a 10% of the remaining loan are going to be paid.
     * This method calculate the remaining loan after n month of payments.
     *
     * @param: loan amount
     * @param: number of month that are going to be paid
     * @return: remaining due amount after the given number of month
     */
    static int getRemainingAmountInNMonths(int amount, int numberOfMonths) {
        var remainingDue = amount;

        for (int i = 0; i < numberOfMonths; i++) {
            remainingDue -= 10 * remainingDue / 100;
        }

        return remainingDue;
    }

    /**
     * Given a loan each month a 10% of the remaining loan are going to be paid.
     * This method calculate the remaining loan after 3 month of payments.
     *
     * @param: loan amount
     * @return: remaining due amount after 3 month
     */
    static int getRemainingAmountIn3Months(int amount) {
        return getRemainingAmountInNMonths(amount, 3);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
