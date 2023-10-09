package hw2;
public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    //Геттеры и сеттеры
    public int getNobility() {return nobility;}
    public int getHonor() {return honor;}
    public int getBravery() {return bravery;}

    public void setBravery(int bravery) {this.bravery = bravery;}
    public void setHonor(int honor) {this.honor = honor;}
    public void setNobility(int nobility) {this.nobility = nobility;}

    @Override
    public String toString() {
        return super.toString() +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery;
    }

    protected int getAbilitiesSum() {
        return nobility + honor + bravery;
    }

    //Метод выясняющий какой из двух учеников Гриффиндора лучший
    public void bestInGryffindor(Gryffindor gryffindor) {
        int scoreStudent_1 = getAbilitiesSum();
        int scoreStudent_2 = gryffindor.getAbilitiesSum();

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
