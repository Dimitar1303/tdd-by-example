package guru.springframework;

public class Dollar {
    int amount;
    //comment
    public Dollar(int amount){
        this.amount = amount;
    }
    public Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }
}
