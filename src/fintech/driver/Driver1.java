package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23003_Chrismansyah Siahaan
 * @author 12S23015_Kevin Kristoforus Samosir
 */

 public class Driver1 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         if(scan.equals("create-account")) {
            String owner = scan.nextLine();
            String accountName = scan.nextLine();
            Account account = new Account(owner, accountName);
            System.out.println(account.toString());
         }
 
         scan.close();
     }
 }
