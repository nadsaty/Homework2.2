package hw2;
public abstract class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.transgress = transgress;
        this.witchcraft = witchcraft;
    }

    //Геттеры и сеттеры
    public String getName() {return name;}
    public int getWitchcraft() {return witchcraft;}
    public int getTransgress() {return transgress;}

    public void setName(String name) {this.name = name;}
    public void setWitchcraft(int witchcraft) {this.witchcraft = witchcraft;}
    public void setTransgress(int transgress) {this.transgress = transgress;}

    @Override
    public String toString() {
        return "Имя: " + name + '\'' +
                ",  магия: " + witchcraft +
                ", трансгрессия: " + transgress;
    }

    protected abstract int getAbilitiesSum();
    private int getBasicAbilitiesSum(){
        return witchcraft + transgress;
    }

    //Метод выясняющий какой из двух учеников Хогвартса лучший
    public void bestInHogwarts(Hogwarts hogwarts) {
        int basicScoreStudent_1 = getBasicAbilitiesSum();
        int basicScoreStudent_2 = hogwarts.getBasicAbilitiesSum();

        if (basicScoreStudent_1 > basicScoreStudent_2) {
            System.out.println("Ученик 1 лучше ученика 2 по базовым навыкам");
        }
        else if (basicScoreStudent_1 < basicScoreStudent_2) {
            System.out.println("Ученик 2 лучше ученика 1 по базовым навыкам");
        }
        else { System.out.println("Ученики равны по базовым навыкам");
        }
    }
}
