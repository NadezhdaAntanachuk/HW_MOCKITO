import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testFindAll0() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

    }

    @Test
    public void testFindAll1() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

    }

    @Test
    public void testFindAll3() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Джентельмены"};
        String[] actual = manager.findAll();

    }

    @Test
    public void testFindLast3() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

    }
}
