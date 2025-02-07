package fintech.driver;
import fintech.model.Account;
import fintech.model.Transaction;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author 12S23003_Chrismansyah Siahaan
 * @author 12S23015_Kevin Kristoforus Samosir
 */

public class Driver2 {
    private static Map<String, Account> accounts = new HashMap<>(); 
    private static double currentBalance = 0.0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        if (command.equals("create-account")) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            Account account = new Account(owner, accountName);
            accounts.put(accountName, account);
            System.out.println(account.toString());
            currentBalance = account.getBalance(); 
        }

        command = scanner.nextLine();


        String accountName = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String postedAt = scanner.nextLine();
        String note = scanner.nextLine();

        Transaction transaction = new Transaction(accountName, amount, postedAt, note, currentBalance);
        currentBalance = transaction.getBalance();

        System.out.println(transaction.toString());

        scanner.close();
    }
}