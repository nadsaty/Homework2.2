package hw2;
public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, int witchcraft, int transgress, int hardworking, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    //Геттеры и сеттеры
    public int getHardworking() {return hardworking;}
    public int getHonesty() {return honesty;}
    public int getLoyalty() {return loyalty;}

    public void setLoyalty(int loyalty) {this.loyalty = loyalty;}
    public void setHonesty(int honesty) {this.honesty = honesty;}
    public void setHardworking(int hardworking) {this.hardworking = hardworking;}

    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие: " + hardworking +
                ", верность: " + loyalty +
                ", честность" + honesty;
    }
}
