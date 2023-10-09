import hw2.*;

public class Main {
    public static void main(String[] args) {

        //Ученики Гриффиндора
                Gryffindor harry = new Gryffindor("Гарри Поттер", 100, 100, 10, 10, 10);
                Gryffindor hermion = new Gryffindor("Гермиона Грейнджер", 100, 98, 10, 10, 9);
                Gryffindor ron = new Gryffindor("Рон Уизли", 75, 70, 8, 9, 6);

        //Ученики Пуффендуя
                Hufflepuff zaharia = new Hufflepuff("Захария Смит", 66, 73, 8, 8, 5);
                Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 100, 90, 9, 9, 9);
                Hufflepuff jastin = new Hufflepuff("Джастин Финч", 45, 47, 6, 4, 5);

        //Ученики Когтеврана
                Ravenclaw cjou = new Ravenclaw("Чжоу Чанг", 80, 65, 5, 5, 6);
                Ravenclaw padma = new Ravenclaw("Падма Патил", 55, 77, 8, 6, 8);
                Ravenclaw markus = new Ravenclaw ("Маркус Белби", 67,89, 7, 4,7);

        //Ученики Слизерина
                Slytherin drako = new Slytherin("Драко Малфой", 95, 100, 10, 10, 10);
                Slytherin graham = new Slytherin("Грэхэм Монтегю", 88, 66, 6, 9, 7);
                Slytherin gregory = new Slytherin("Грегори Гойл", 90, 55, 7, 8, 9);

        space();
        //Данные ученика
        System.out.println(graham);
        space();

        //Лучший на факультете Гриффиндора
        harry.bestInGryffindor(hermion);
        //Лучший на факультете Пуффендуя
        zaharia.bestInHufflepuff(sedrik);
        //Лучший на факультете Когтеврана
        padma.bestInRavenclaw(markus);
        //Лучший на факультете Слизерина
        drako.bestInSlytherin(gregory);
        space();

        //Лучший в Хогвартсе
        harry.bestInHogwarts(drako);
        space();
    }

    public static void space() {
        System.out.println("-----------------------------------------------------------------------------");
    }
}