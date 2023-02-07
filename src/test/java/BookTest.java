import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BookTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void mainTest() {
        String expectedOutput = "Object state after instantiation:\n" +
                "Book{title='null', isbn='null', edition=1, pages=0, language='English'}\n" +
                "Book{title='null', isbn='null', edition=1, pages=0, language='English'}\n" +
                "Book{title='null', isbn='null', edition=1, pages=0, language='English'}\n" +
                "Object state after assigning values to instance variables:\n" +
                "Book{title='Effective Java', isbn='978-0134685991', edition=3, pages=416, language='English'}\n" +
                "Book{title='Spring Boot: Up & Running', isbn='978-1492076988', edition=1, pages=328, language='English'}\n" +
                "Book{title='HTML para novatos', isbn='978-1493714148', edition=1, pages=105, language='Spanish'}\n";

        //call the main method
        Book.main(null);

        //compare expected output with actual output
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}