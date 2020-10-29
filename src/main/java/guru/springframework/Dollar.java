package guru.springframework;

public class Dollar {
    int amount;
    //comment
    public Dollar(int amount){
        this.amount = amount;
    }
    public void times(int multiplier){
        this.amount *= multiplier;
    }
}
