import org.junit.*;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * User: Brian Janice
 * Date: 12/9/2016
 */
public class Project06Test {
    /*
    This stuff is needed here so that i can simulate keyboard input and capture console output
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    /*
    This stuff is needed here so that i can simulate keyboard input and capture console output
     */
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testClassInvocation() {
        Project06 prj = new Project06();
    }

    @Ignore
    @Test
    public void testPrintDigits() throws Exception {
        String outputIShouldGet = "Check digit should be: 1\r\nCheck digit is: 2\r\n";

//        Project06.printDigits(1,2);
        assertEquals(outputIShouldGet, outContent.toString());
    }

    @Ignore
    @Test
    public void printUPCMessageTrue() throws Exception {
        String outputIShouldGet = "UPC is valid\r\n";
//        Project06.printUPCMessage(true);
        assertEquals(outputIShouldGet, outContent.toString());
    }

    @Ignore
    @Test
    public void printUPCMessageFalse() throws Exception {
        String outputIShouldGet = "UPC is not valid\r\n";
//        Project06.printUPCMessage(false);
        assertEquals(outputIShouldGet, outContent.toString());
    }

    @Ignore
    @Test
    public void checkComputedCheckDigit() throws Exception {
//        assertEquals(5, Project06.computedCheckDigit("726412175425"));
    }

    @Test
    public void checkEmptyRun() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
        String outputIShouldGet = "Enter a UPC (enter a blank line to quit): Goodbye!\r\n";

        String[] args = null;
        System.setIn(in);
        Project06.main(args);
        assertEquals(outputIShouldGet, outContent.toString());
    }

    @Test
    public void checkOneGoodRun() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("726412175425\n\r".getBytes());
        String outputIShouldGet = "Enter a UPC (enter a blank line to quit): Check digit should be: 5\r\nCheck digit is: 5\r\nUPC is valid\r\n\r\nEnter a UPC (enter a blank line to quit): Goodbye!\r\n";

        String[] args = null;
        System.setIn(in);
        Project06.main(args);
        String myOutput = outContent.toString();
        assertEquals(outputIShouldGet, myOutput);
    }

    @Test
    public void checkOneBadRun() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("726412175424\n\r".getBytes());
        String outputIShouldGet = "Enter a UPC (enter a blank line to quit): Check digit should be: 5\r\nCheck digit is: 4\r\nUPC is not valid\r\n\r\nEnter a UPC (enter a blank line to quit): Goodbye!\r\n";

        String[] args = null;
        System.setIn(in);
        Project06.main(args);
        String myOutput = outContent.toString();
        assertEquals(outputIShouldGet, myOutput);
    }

    @Test
    public void checkOneShortRun() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("72641217542\n\r".getBytes());
        String outputIShouldGet = "Enter a UPC (enter a blank line to quit): ERROR! UPC MUST have exactly 12 digits\r\n\r\nEnter a UPC (enter a blank line to quit): Goodbye!\r\n";

        String[] args = null;
        System.setIn(in);
        Project06.main(args);
        String myOutput = outContent.toString();
        assertEquals(outputIShouldGet, myOutput);
    }

    @Test
    public void checkGetOddComputation() throws Exception {
        int oddComputation = Project06.getOddComputation("23456");
        assertEquals(36,oddComputation);

    }
}