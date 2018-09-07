import static org.junit.Assert.*;

import org.junit.Test;

import com.learn.git.StartEmployee;

public class TestEmployee {
	@Test
	public void test() {
		StartEmployee st = new StartEmployee();
		assertEquals(1,st.createEmp() );
	System.out.println("Test success");
	}
}
