package Cal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class test1 {
	Model l =new Model();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	
	assertEquals((int)2.0,(int)l.Div(8.0,4.0));
	assertEquals(1,(int)(l.Div(8.0,0.0)));
	assertEquals(1,(int)(l.mod(8.0,0.0)));
	assertEquals(1,(int)(l.sqr(-1)));
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
