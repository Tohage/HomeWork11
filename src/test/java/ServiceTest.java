import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    DataMovie one = new DataMovie(1, "Бладшот", "боевик");
    DataMovie two = new DataMovie(2, "Вперед", "мультфильм");
    DataMovie three = new DataMovie(3, "Отель белград", "комедия");
    DataMovie four = new DataMovie(4, "Джентельмены", "боевик");
    DataMovie five = new DataMovie(5, "Человек невидимка", "ужасы");
    DataMovie six = new DataMovie(6, "Тролли", "мультфильм");
    DataMovie seven = new DataMovie(7, "Номер один", "комедия");
    DataMovie eight = new DataMovie(8, "Вверх", "мультфильм");
    DataMovie nine = new DataMovie(9, "Ридик", "боевик");
    DataMovie ten = new DataMovie(10, "Оно", "ужасы");
    DataMovie eleven = new DataMovie(11, "Матрица", "боевик");

    PosterManager manager = new PosterManager();

    @Test
    public void showMoviesReversOrder() {

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);

        DataMovie[] actual = manager.findLast();
        DataMovie[] expected = {nine, eight, seven, six, five, four, three, two, one};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAsWeAdd() {

        PosterManager manager = new PosterManager(4);

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        DataMovie[] actual = manager.findLast();
        DataMovie[] expected = {eleven, ten, nine, eight};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastTen() {

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        DataMovie[] actual = manager.findLast();
        DataMovie[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Assertions.assertArrayEquals(expected, actual);
    }
}

