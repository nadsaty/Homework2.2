package hw2;
public class Ravenclaw extends Hogwarts{
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String name, int witchcraft, int transgress, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    //Геттеры и сеттеры
    public int getWisdom() {return wisdom;}
    public int getWit() {return wit;}
    public int getCreativity() {return creativity;}

    public void setCreativity(int creativity) {this.creativity = creativity;}
    public void setWit(int wit) {this.wit = wit;}
    public void setWisdom(int wisdom) {this.wisdom = wisdom;}

    @Override
    public String toString() {
        return super.toString() +
                ", мудрость: " + wisdom +
                ", остроумность: " + wit +
                ", креативность: " + creativity;
    }

    protected int getAbilitiesSum() {
        return wisdom + wit + creativity;
    }

    //Метод выясняющий какой из двух учеников Когтеврана лучший
    public void bestInRavenclaw(Ravenclaw ravenclaw) {
        int scoreStudent_1 = getAbilitiesSum();
        int scoreStudent_2 = ravenclaw.getAbilitiesSum();

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
