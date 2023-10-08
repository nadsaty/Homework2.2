package hw2;
public class Methods {
    public void print(Ravenclaw[] ravenclaws, String name) {
        for (Hogwarts element : ravenclaws) {
            if (element.getName().equals(name)) {
                System.out.println(element);
            }
        }
    }
    public void print(Gryffindor[] gryffindors, String name) {
        for (Hogwarts element : gryffindors) {
            if (element.getName().equals(name)) {
                System.out.println(element);
            }
        }
    }
    public void print(Hufflepuff[] hufflepuffs, String name) {
        for (Hogwarts element : hufflepuffs) {
            if (element.getName().equals(name)) {
                System.out.println(element);
            }
        }
    }
    public void print(Slytherin[] slytherins, String name) {
        for (Hogwarts element : slytherins) {
            if (element.getName().equals(name)) {
                System.out.println(element);
            }
        }
    }

    //Метод выясняющий какой из двух учеников Гриффиндора лучший
    public void bestInGryffindor(Gryffindor[] gryffindors, String student_1, String student_2) {
        int scoreStudent_1 = 0;
        int scoreStudent_2 = 0;
        for (Gryffindor element : gryffindors) {
            if (element.getName().equals(student_1)) {
                scoreStudent_1 = element.getNobility()
                        + element.getHonor()
                        + element.getBravery();
            } if (element.getName().equals(student_2)) {
                scoreStudent_2 = element.getNobility()
                        + element.getHonor()
                        + element.getBravery();
            }
        }
        if (scoreStudent_1 > scoreStudent_2) {System.out.println(student_1 + " лучший Гриффиндорец, чем " + student_2);
        } else {System.out.println(student_2 + " лучший Гриффиндорец, чем " + student_1);}
    }

    //Метод выясняющий какой из двух учеников Пуффендуя лучший
    public void bestInHuffleppuff(Hufflepuff[] hufflepuffs, String student_1, String student_2) {
        int scoreStudent_1 = 0;
        int scoreStudent_2 = 0;
        for (Hufflepuff element : hufflepuffs) {
            if (element.getName().equals(student_1)) {
                scoreStudent_1 = element.getHardworking()
                        + element.getLoyalty()
                        + element.getHonesty();
            } if (element.getName().equals(student_2)) {
                scoreStudent_2 = element.getHardworking()
                        + element.getLoyalty()
                        + element.getHonesty();
            }
        }
        if (scoreStudent_1 > scoreStudent_2) {System.out.println(student_1 + " лучший Пуффендуец, чем " + student_2);
        } else {System.out.println(student_2 + " лучший Пуффендуец, чем " + student_1);}
    }

    //Метод выясняющий какой из двух учеников Когтеврана лучший
    public void bestInRavenclaw(Ravenclaw[] ravenclaws, String student_1, String student_2) {
        int scoreStudent_1 = 0;
        int scoreStudent_2 = 0;
        for (Ravenclaw element : ravenclaws) {
            if (element.getName().equals(student_1)) {
                scoreStudent_1 = element.getWisdom()
                        + element.getWit()
                        + element.getCreativity();
            } if (element.getName().equals(student_2)) {
                scoreStudent_2 = element.getWisdom()
                        + element.getWit()
                        + element.getCreativity();
            }
        }
        if (scoreStudent_1 > scoreStudent_2) {System.out.println(student_1 + " лучший Когтевранец, чем " + student_2);
        } else {System.out.println(student_2 + " лучший Когтевранец, чем " + student_1);}
    }

    //Метод выясняющий какой из двух учеников Слизерина лучший
    public void bestInSlytherin(Slytherin[] slytherins, String student_1, String student_2) {
        int scoreStudent_1 = 0;
        int scoreStudent_2 = 0;
        for (Slytherin element : slytherins) {
            if (element.getName().equals(student_1)) {
                scoreStudent_1 = element.getCunning()
                        + element.getDetermination()
                        + element.getAmbition();
            } if (element.getName().equals(student_2)) {
                scoreStudent_2 = element.getCunning()
                        + element.getDetermination()
                        + element.getAmbition();
            }
        }
        if (scoreStudent_1 > scoreStudent_2) {System.out.println(student_1 + " лучший Слизеринец, чем " + student_2);
        } else {System.out.println(student_2 + " лучший Слизеринец, чем " + student_1);}
    }

    //Метод выясняющий какой из двух учеников Хогвартса лучший
    public void bestInHogwarts(Hogwarts[] students, String student_1, String student_2) {
        int scoreStudent_1 = 0;
        int scoreStudent_2 = 0;
        for (Hogwarts element : students) {
            if (element.getName().equals(student_1)) {
                scoreStudent_1 = element.getWitchcraft() + element.getTransgress();
            }
            if (element.getName().equals(student_2)) {
                scoreStudent_2 = element.getWitchcraft() + element.getTransgress();
            }
        }
        if (scoreStudent_1 > scoreStudent_2) {
            System.out.println(student_1 + "  обладает большей мощностью магии, чем " + student_2);
        } else {System.out.println(student_2 + "  обладает большей мощностью магии, чем " + student_1);}
    }
}
