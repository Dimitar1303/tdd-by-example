package guru.springframework;

import java.util.Objects;

public class Dollar extends Money {

    //comment
    public Dollar(int amount){
        this.amount = amount;
    }
    public Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

}
