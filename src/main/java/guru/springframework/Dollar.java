package guru.springframework;

import java.util.Objects;

public class Dollar extends Money {
    private String  currency;
    //comment
    public Dollar(int amount, String currency){
        super(amount,currency);
    }
    public Dollar times(int multiplier){
        return Money.dollar(this.amount * multiplier);
    }

}
