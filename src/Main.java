import hw2.*;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 100, 100),
                new Hogwarts("Гермиона Грейнджер", 100, 98),
                new Hogwarts("Рон Уизли", 75, 70),
                new Hogwarts("Чжоу Чанг", 80, 65),
                new Hogwarts("Падма Патил", 55, 77),
                new Hogwarts("Маркус Белби", 67, 89),
                new Hogwarts("Драко Малфой", 95, 100),
                new Hogwarts("Грэхэм Монтегю", 88, 66),
                new Hogwarts("Грегори Гойл", 90, 55),
                new Hogwarts("Захария Смит", 66, 73),
                new Hogwarts("Седрик Диггори", 100, 90),
                new Hogwarts("Джастин Финч", 45, 47)
        };
        //Ученики Гриффиндора
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 100, 100,
                        10, 10, 10),
                new Gryffindor("Гермиона Грейнджер", 100, 98,
                        10, 10, 9),
                new Gryffindor("Рон Уизли", 75, 70,
                        8, 9, 6),

        };
        //Ученики Пуффендуя
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 66, 73,
                        8, 8, 5),
                new Hufflepuff("Седрик Диггори", 100, 90,
                        9, 9, 9),
                new Hufflepuff("Джастин Финч", 45, 47,
                        6, 4, 5)
        };
        //Ученики Когтеврана
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 80, 65,
                        5, 5, 6),
                new Ravenclaw("Падма Патил", 55, 77,
                        8, 6, 8),
                new Ravenclaw("Маркус Белби", 67,89,
                        7, 4,7)
        };
        //Ученики Слизерина
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 95, 100,
                        10, 10, 10),
                new Slytherin("Грэхэм Монтегю", 88, 66,
                        6, 9, 7),
                new Slytherin("Грегори Гойл", 90, 55,
                        7, 8, 9)
        };

        //Данные ученика
        Methods methods = new Methods();
        methods.print(gryffindors, "Гарри Поттер");
        //Лучший на факультете Гриффиндор
        methods.bestInGryffindor(gryffindors, "Гермиона Грейнджер", "Рон Уизли");
        //Лучший в школе Хогвартс
        methods.bestInHogwarts(students, "Захария Смит","Маркус Белби");

    }
}