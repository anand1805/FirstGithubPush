package TestExample.FirstMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Test
	@Parameters("anand")
	private void firstMethod(String name) {
		System.out.println("the parameter is "+name);

	}

}
