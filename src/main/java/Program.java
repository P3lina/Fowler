import java.lang.*;
import java.util.*;
/**
 * Note that Java console applications need to be run through the java runtime
 * by running "java -jar JarFile.jar" in the command line.
 * Java console applications can not be previewed in the Compilr IDE, only applets can.
 */
public class Program
{
    /**
     * This is the main entry point for the application
     */
    
    
    public static void main(String args[]) 
    {
        String result;
        System.out.println("Welcome to the MovieRental.Movie Store");
        Movie m1 = new Movie("movie1", new NewReleasePrice());
        Movie m2 = new Movie("movie2", new ChildrensPrice());
        Movie m3 = new Movie("movie3", new RegularPrice());
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Rental r3 = new Rental(m3,4);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        c1.addRental(r3);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
        System.out.println("\n"+ c1.htmlStatement());
    }
}


