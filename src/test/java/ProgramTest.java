import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProgramTest {

    private Customer c1 = new Customer("joe");

    @Test
    public void test() {
        Movie m1 = new Movie("movie1", new NewReleasePrice());
        Movie m2 = new Movie("movie2", new ChildrensPrice());
        Movie m3 = new Movie("movie3", new RegularPrice());
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Rental r3 = new Rental(m3,4);
        c1.addRental(r1);
        c1.addRental(r2);
        c1.addRental(r3);
        assertEquals(m1.getName(), new Movie("movie1", new NewReleasePrice()).getName());
        assertEquals(m2.getName(), new Movie("movie2", new ChildrensPrice()).getName());
        assertEquals(m3.getName(), new Movie("movie3", new RegularPrice()).getName());
        assertEquals(r1.getCharge(), new Rental(m1, 10).getCharge());
        assertEquals(r2.getCharge(), new Rental(m2, 5).getCharge());
        assertEquals(r3.getCharge(), new Rental(m3, 4).getCharge());
        assertEquals(c1.getName(), "joe");
    }
}
