package Cal;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;


class Test {

	Model l = new Model();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void test() {
		//fail("Not yet implemented");
		
		assertEquals((int)2.0,(int)l.Div(8.0,4.0));
		assertEquals(1,(int)(l.Div(8.0,0.0)));
		assertEquals(1,(int)(l.mod(8.0,0.0)));
		assertEquals(1,(int)(l.sqr(-1)));
		
		
		
	}

	

}
