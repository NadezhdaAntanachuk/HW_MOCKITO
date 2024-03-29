import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testFindAll0() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll3() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast3() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // фильмов меньше, чем лимит
    public void testFindLast3WithLimit5() {
        MovieManager manager = new MovieManager(5);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // фильмов = лимиту
    public void testFindLast3WithLimit3() {
        MovieManager manager = new MovieManager(3);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // фильмов больше, чем лимит
    public void testFindLast3WithLimit2() {
        MovieManager manager = new MovieManager(2);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
