package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{

	Person R;
	Person J;
	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo", "Mont", 15);
		J = new Person("Juliet", "Cap", 13);
	}

	@Test
	void testToString()
	{
		assertEquals(R.toString(),"Person: Romeo Mont, 15");
	}

}
