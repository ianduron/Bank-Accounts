
/**
 * Subclass of BankAccount
 * In this type of account, you promise to leave the money in the bank for a specified about of time.
 * @author Ian Duron
 * @version December 1, 2016
 */
public class TimeDepositAccount extends BankAccount
{
    private int maturity;
    private int monthCounter;
    public static final double ANNUAL_INTEREST_RATE = .011;
    public static final double PENALTY_WITHDRAWAL = .20;

    /**
     * Constructs a TimeDepositAccount with a given balance.
     * @param initialBalance the initial balance
     * @param id the id for this account
     */
    public TimeDepositAccount(double initialBalance, String id, int maturity)
    {   
        super(initialBalance,id);
        this.maturity = maturity;
    }

    @Override
    /**
     * Do end of month processing for the account
     */
    public void endOfMonth()
    {
        double interest = (super.getBalance() * ANNUAL_INTEREST_RATE) / 12;
        super.deposit(interest);   
        monthCounter++;
    }

    /**
     * @return the amount of time the money must be left on deposit.
     */
    public int getTimeToMaturity()
    {
        return maturity;
    }

    @Override
    /**
    Withdraws money from the bank account.
    @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {   
        super.withdraw(amount);
        if(monthCounter < getTimeToMaturity())
        {
            super.withdraw(amount * PENALTY_WITHDRAWAL);
        }
    }
}
