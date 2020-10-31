package guru.springframework;

public class Franc extends Money {
    //comment
    public Franc(int amount, String currency){
        super(amount, currency);

    }
    public Franc times(int multiplier){
        return Money.franc(this.amount * multiplier);
    }
}
