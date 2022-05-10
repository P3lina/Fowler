import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MovieTest {
    Movie movie;
    @BeforeAll
    void beforeAll() {
        this.movie = new Movie("title", new NewReleasePrice());
    }

    @Test
    void getPriceCode() {
        assertEquals(movie.getPrice().getPriceCode(), new NewReleasePrice().getPriceCode());
    }

    @Test
    void setPriceCode() {
        movie.setPrice(new RegularPrice());
        assertEquals(movie.getPrice().getPriceCode(), new RegularPrice().getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals(movie.getName(), "title");
    }
}