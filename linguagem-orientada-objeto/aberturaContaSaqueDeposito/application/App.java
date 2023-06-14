package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input;
        Account account;

        int number;
        String holder;
        double balanceInitial;
        double withdrawLimit;

        Locale.setDefault(Locale.US);
        input = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        number = input.nextInt();
        input.nextLine();
        System.out.print("Holder: ");
        holder = input.nextLine();
        System.out.print("Initial Balance: ");
        balanceInitial = input.nextDouble();
        System.out.print("Withdraw limit: ");
        withdrawLimit = input.nextDouble();

        account = new Account(number, holder, balanceInitial, withdrawLimit);

        System.out.println();

        try {
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(input.nextDouble());
            System.out.print("New Balance: ");
            System.out.printf(Account.BALANCE_FORMAT, account.getBalance());

        } catch (DomainException e) {
            System.err.println("Withdraw error: " + e.getMessage());
        }
        input.close();
    }
}
