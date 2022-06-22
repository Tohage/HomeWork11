

public class Main {

    public static void main(String[] args) {

        DataMovie one = new DataMovie(1,"Бладшот","боевик");
        DataMovie two = new DataMovie(2,"Вперед","мультфильм");
        DataMovie three = new DataMovie(3,"Отель белград","комедия");
        DataMovie four = new DataMovie(4,"Джентельмены","боевик");
        DataMovie five = new DataMovie(5,"Человек невидимка","ужасы");
        DataMovie six = new DataMovie(6,"Тролли","мультфильм");
        DataMovie seven = new DataMovie(7,"Номер один","комедия");
        DataMovie eight = new DataMovie(8,"Вверх","мультфильм");
        DataMovie nine = new DataMovie(9,"Ридик","боевик");
        DataMovie ten = new DataMovie(10,"Оно","ужасы");
        DataMovie eleven = new DataMovie(11,"Матрица","боевик");

        PosterManager manager = new PosterManager();

        manager.add (one);
        manager.add (two);
        manager.add (three);
        manager.add (four);
        manager.add (five);
        manager.add (six);
        manager.add (seven);
        manager.add (eight);
        manager.add (nine);
        manager.add (ten);
        manager.add (eleven);

        DataMovie[] all = manager.findAll();

        DataMovie[] last = manager.findLast();
    }
}

