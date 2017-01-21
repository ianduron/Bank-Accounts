/**
 * Has no minimum balance, but there is a charges for every transaction after
a certain number of free transactions
 * 
 * @author Ian Duron
 * @version November 30, 2016
 */
public class FeeBasedAccount extends BankAccount
{
    public static final int FREE_TRANSACTIONS = 3;
    public static final double CHARGE_FEE = 2.00;
    private int transactions;

    /**
     * Constructor for the class
     * @param balance the initial balance
     * @param accountId the id for this account
     */
    public FeeBasedAccount(double balance, String accountId)
    {
        super(balance, accountId);
        transactions = 0;
    }	

    @Override
    /**
    Deposits money into the bank account.
    @param amount the amount to deposit
     */
    public void deposit(double amount)
    {  
        super.deposit(amount);
        transactions++;
    }

    @Override
    /**
    Withdraws money from the bank account.
    @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {   
        super.withdraw(amount);
        transactions++;
    }

    @Override
    /**
     * Do end of month processing for the account
     */
    public void endOfMonth()
    {
        double notFree = transactions - FREE_TRANSACTIONS;
        double totalFees = notFree * CHARGE_FEE;
        if(transactions > FREE_TRANSACTIONS)
        {
            super.withdraw(totalFees);
        }
    }
}
