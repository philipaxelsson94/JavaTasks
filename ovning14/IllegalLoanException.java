package ovning14;

public class IllegalLoanException extends RuntimeException{
    public IllegalLoanException(){

    }
    public IllegalLoanException(String message){
        super(message);
    }
}
