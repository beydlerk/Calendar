/**
 *The jUnit test class for the iCalendarDriver.java. 
 * 
 * @author Kevin Beydler, Chansen Hesia, Conner Higashino
 * @version ICS 314
 * @date 2/27/2016
 **/

//Import Preprocesser Directives
import java.util.*;
import java.io.*;
import java.text.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class iCalendarDriverTestCases 
{

	@Test //Standard test
	public void test() 
	{
		fail("Not yet implemented");
	}

	@Test
	public final void testMain() 
	{
	iCalendarDriver.main(null);//see if the main() works
	}
	
	@Test
	public final void testGetFile() 
	{
	Scanner inputTest1 = new Scanner(System.in); //creates test scanner to test input from user
	assertEquals(“test.ics", CalendarDriver.getFile(inputTest1)); //see if the method can create a class with test.ics input
	}

}
