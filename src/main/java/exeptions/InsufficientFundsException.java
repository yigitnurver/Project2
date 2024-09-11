package exeptions;

/***
 * This exception is thrown when user tries to make a transaction
 * and he does not enough funds for that
 *
 *
 *
 */
public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(String errorMsg){
        super(errorMsg);
    }
}
