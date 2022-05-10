import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RentalTest {

    Movie movie;
    Rental rental;

    @BeforeAll
    void beforeAll() {
        movie = new Movie("title", 10);
        rental = new Rental(movie, 20);
    }
    @Test
    void getDaysRented() {
        assertEquals(rental.getDaysRented(), 20);
    }

    @Test
    void getMovie() {
        assertEquals(rental.getMovie(), movie);
    }
}