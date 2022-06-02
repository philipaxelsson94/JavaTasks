package ovning17;



public class Money implements IMoney2  {
    private Currency currency;
    private double amount;

    public Money(Currency currency, double amount) throws IllegalArgumentException {
        this.currency = currency;
        if (amount < 0) {throw new IllegalArgumentException("Can't be less than 0");}
        else this.amount = amount;

    }
    public Money(int amount){
        if (amount < 0) {throw new IllegalArgumentException("Can't be less than 0");}
        else this.amount = amount;
        this.currency = Currency.EUR;
    }
    public Money(){
        this.amount = 0;
        this.currency = Currency.EUR;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public Money copy() {
        return new Money(this.currency, this.amount);
    }

    @Override
    public Money toCurrency(Currency newCurrency) {
        return new Money(newCurrency, this.amount);
    }

    @Override
    public int compareTo(Money other) {
        if (Math.abs(this.amount - other.amount) < 0.003){
            return 0;
        }
        else if(this.amount - other.amount < -0.003){
            return -1;
        }
        else return 1;
    }

    @Override
    public Money subtract(Money moneyToAdd) throws IllegalArgumentException {
        double sum = this.amount - moneyToAdd.getAmount();
        if (sum < 0){
            throw new IllegalArgumentException("sum < 0");
        }
        else return new Money(this.currency, sum);
    }

    @Override
    public Money add(Money moneyToAdd) {
        double sum = this.amount + moneyToAdd.getAmount();
        return new Money(this.currency, sum);
    }

    @Override
    public String toString(){
        return Math.round(amount * 100.0) / 100.0 + " " + currency.getName() + " " + currency.getRate();
    }
}
