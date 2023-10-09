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

    protected int getAbilitiesSum() {
        return hardworking + loyalty + honesty;
    }

    //Метод выясняющий какой из двух учеников Пуффендуя лучший
    public void bestInHufflepuff(Hufflepuff hufflepuff) {
        int scoreStudent_1 = getAbilitiesSum();
        int scoreStudent_2 = hufflepuff.getAbilitiesSum();

        if (scoreStudent_1 > scoreStudent_2) {
            System.out.println("Ученик 1 лучше ученика 2");
        }
        else if (scoreStudent_1 < scoreStudent_2) {
            System.out.println("Ученик 2 лучше ученика 1");
        }
        else { System.out.println("Ученики равны");
        }
    }
}
