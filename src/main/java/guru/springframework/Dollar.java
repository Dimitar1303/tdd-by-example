package guru.springframework;

public class Dollar {
    int amount;
    //this is comment for change
    public Dollar(int amount){
        this.amount = amount;
    }
    public void times(int multiplier){
        this.amount *= multiplier;
    }
}
