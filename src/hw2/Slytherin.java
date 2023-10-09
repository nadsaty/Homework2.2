package hw2;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition) {
        super(name, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    //Геттеры и сеттеры
    public int getCunning() {return cunning;}
    public int getDetermination() {return determination;}
    public int getAmbition() {return ambition;}

    public void setAmbition(int ambition) {this.ambition = ambition;}
    public void setDetermination(int determination) {this.determination = determination;}
    public void setCunning(int cunning) {this.cunning = cunning;}

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость " + cunning +
                ", решительность" + determination +
                ", амбициозность" + ambition;
    }

    protected int getAbilitiesSum() {
        return cunning + determination + ambition;
    }

    //Метод выясняющий какой из двух учеников Слизерина лучший
    public void bestInSlytherin(Slytherin slytherin) {
        int scoreStudent_1 = getAbilitiesSum();
        int scoreStudent_2 = slytherin.getAbilitiesSum();

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
