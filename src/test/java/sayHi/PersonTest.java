package sayHi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{

	PersonAge R;
	PersonAge J;
	PersonAge M;
	PersonAge Y;
	
	@BeforeEach
	void setUp() throws Exception
	{
		R = new PersonAge("Romeo", "Mont", 15);
		J = new PersonAge("Juliet", "Cap", 13);
		M = new PersonAge("Count", "Dooku", 54);
		Y = new PersonAge("Yo", "Da", 114);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Mont, 15", R.toString());
	}

	@Test
	void testPerson()
	{
		assertThrows(UnderAgeException.class,
				()->{
					R.makePerson(J);
				});
		assertThrows(UnderAgeException.class,
				()->{
					M.makePerson(J);
				});
	
		PersonAge child;
		try {
			child = M.makePerson(Y);
			
			assertEquals(M.getFname(), child.getFname());
			assertEquals(Y.getLname(), child.getLname());
			assertEquals(0,child.getAge());
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("threw exception");
		}
		
		
	}
}
