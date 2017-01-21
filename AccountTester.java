/**
 * Tester for BankAccount and its subclasses
 */
public class AccountTester
{
    public static void main(String[] args)
    {
        BankAccount account = new FeeBasedAccount(5000, "abc123");
        account.endOfMonth();
        System.out.println("No transactions: " + account.getBalance());
        System.out.println("Expected: 5000.0");
        for (int i = 0; i < FeeBasedAccount.FREE_TRANSACTIONS; i++)
        {
            account.withdraw(1);
        }
        account.endOfMonth();
        System.out.println("Three Transaction: " + account.getBalance());
        System.out.println("Expected: 4997.0");
        
        //make new account
        account = new FeeBasedAccount(5000, "xyz789");
        
        for (int i = 0; i < FeeBasedAccount.FREE_TRANSACTIONS ; i++)
        {
            account.withdraw(1);
        }
        
        for (int i = 0; i < 10; i++)
        {
            account.deposit(1);
        }
        account.endOfMonth();
        System.out.println("Many Transactions: " + account.getBalance());
        System.out.println("Expected: 4987.0");

    }
}