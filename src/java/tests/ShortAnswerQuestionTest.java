/**
 * 
 */
package tests;

import static org.junit.Assert.fail;
import jsonParsing.ShortAnswerQuestion;

import org.junit.Test;

public class ShortAnswerQuestionTest {

	private String passing = "Short Answer : General"
			+ System.getProperty("line.separator") + "Are you awake?"
			+ System.getProperty("line.separator");

	@Test
	public void test() {

		ShortAnswerQuestion q = new ShortAnswerQuestion("Are you awake?",
				"General");

		System.out.println("Output:\n");
		System.out.println(q.toString());
		System.out.println("\nExpected Output:\n");
		System.out.println(passing);

		if (!passing.equalsIgnoreCase(q.toString())) {
			fail("Output not expected.");
		}
	}

}
