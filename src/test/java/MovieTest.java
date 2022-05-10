import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MovieTest {
    Movie movie;
    @BeforeAll
    void beforeAll() {
        this.movie = new Movie("title", 10);
    }

    @Test
    void getPriceCode() {
        assertEquals(movie.getPriceCode(), 10);
    }

    @Test
    void setPriceCode() {
        movie.setPriceCode(20);
        assertEquals(movie.getPriceCode(), 20);
    }

    @Test
    void getTitle() {
        assertEquals(movie.getTitle(), "title");
    }
}