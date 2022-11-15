import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Runner {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount ("Beyonce", "Knowles",LocalDate.of(1981,9,4), 5873092, 0);
        BankAccount account2 = new BankAccount ("Rihanna", "Fenty", LocalDate.of(1988, 2, 2), 9274630, 0);

        account1.setFirstName("JayZ");
        account1.setAccountNumber(6478392);
        account2.setDateOfBirth(LocalDate.of(1999,11,1));


        System.out.println(account1.getFirstName());
        System.out.println(account2.getDateOfBirth());
        System.out.println(account1.getAccountNumber());


        //Deposit
        account1.deposit(500);
       account2.deposit(100);

        System.out.println("Account 1's new balance is " + account1.getFinalBalance());
        System.out.println("Account 2's new balance is " + account2.getFinalBalance());

        // Withdrawal
        account1.withdraw(200);
        account2.withdraw(150);

        System.out.println("New balance of acc 1 " + account1.getFinalBalance());

        account1.addInterest(0.01);
        System.out.println("Beyonce balance with interest " + (account1.getFinalBalance());


    }





}
