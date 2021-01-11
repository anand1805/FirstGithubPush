package TestExample.FirstMethod;

import org.testng.annotations.Test;

public class GroupExample {
	@Test(groups= {"bike"})
	public void yamahaBike() {
		System.out.println("r15");

	}
	@Test(groups= {"bike"})
	public void yamahaRay() {
		System.out.println("ray");

	}
	@Test(groups= {"ktm"})
	public void ktmDuke() {
		System.out.println("duke");

	}
	@Test(groups= {"ktm"})
	public void ktmDuke200() {
		System.out.println("duke200");

	}

}
