BankAccount:

Requires a minimum balance of 5000. There is a $15.00 fee for any month where the ending balance is below the minimum balance. There is an endOfMonth method to handle end of month processing. Its subclasses will handle end of month processing differently.

FeeBasedAccount:

This account is a subclass of BankAccount. It has no minimum balance, but there is a charges for every transaction after a certain number of free transactions. At the current time, the number of free transactions is 3 and the charge is a $2.00 for every transaction after that amount. Both deposits and withdrawals are transactions. There is no charge to get the balance. The fees are subtracted during end of moth processing. Define and use constants. You did something similar to this in one of the labs.

TimeDepositAccount:

This account is a subclass of BankAccount. In this type of account, you promise to leave the money in the bank for a specified about of time. There is a penalty for early withdrawal. The constructor takes an additional parameter: the amount of time you must leave the money in the bank in months as an int. (This time is called the time to maturity). The current the interest rate is 1.1% per year compounded monthly. The penalty for early withdrawal is 20% of the amount withdrawn. The penalty is subtracted immediately, but interest is added during end of month processing. Method getTimeToMaturity that returns the amount of time the money must be left on deposit. This is provided in the constructor and does not change. There is no penalty for depositing money.
