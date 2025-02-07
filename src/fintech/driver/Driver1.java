package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23003_Chrismansyah Siahaan
 * @author 12S23015_Kevin Kristoforus Samosir
 */

 public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String command = scanner.nextLine().trim();
        
        if (command.equals("create-account")) {
            String owner = scanner.nextLine().trim();
            String accountName = scanner.nextLine().trim();
            
            Account account = new Account(owner, accountName);
            
            System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance());
        }
        
        scanner.close();
    }
}

