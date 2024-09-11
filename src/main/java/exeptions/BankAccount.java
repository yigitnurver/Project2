package exeptions;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;

    }

    void transferFunds(double amountToTransfer){
        if(amountToTransfer>balance){
            throw new InsufficientFundsException("NOT ENOUGH FUNDS");
        }
    }
}
