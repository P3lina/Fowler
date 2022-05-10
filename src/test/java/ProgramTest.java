import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ProgramTest {


    @Test
    public void test() {
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        String result = "Rental Record for " + c1.getName() + "\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\t" + r1.getMovie().getTitle() + "\t\t" + r1.getDaysRented() + "\t30.0\n" +
                "\t" + r2.getMovie().getTitle() + "\t\t" + r2.getDaysRented() + "\t4.5\n" +
                "Amount owed is 34.5\n" +
                "You earned 3 frequent renter points";
        System.out.println(c1.statement());
        assertEquals(result, c1.statement());
    }
}
