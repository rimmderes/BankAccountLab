import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {


    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public int accountNumber;
    public double balance;


    public BankAccount(String inputFirstName, String inputLastName, LocalDate inputDoB, int inputAccountNumber, int inputBalance) {

        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDoB;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;

        LocalDateTime dateOfBirth = LocalDateTime.now();
        System.out.println(dateOfBirth);

    }
// GETTERS AND SETTERS

    public String getFirstName() {
        return this.firstName;

    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }



    public int getAccountNumber () {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public int getBalance () {
        return this.accountNumber;
    }

    public void getBalance( int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }


// Deposit
    public void deposit(double amount) {
    balance = balance + amount;
    }


    //public Integer add(int a, int b) {
        // balance = balance + depositAmount;
       // this.balance = (balance);
        //return a + b;


// Withdraw

    public void withdraw(double amount) {
       balance = balance - amount;
        // this.balance = (int balance, int withdrawalAmount);
        // return balance + withdrawalAmount;
    }

// Get Balance

   public double getFinalBalance() {
        return balance;
   }

    // interest

    public void addInterest(double interestRate) {
        double interest;
        interest = balance + (balance * interestRate);

    }


}











