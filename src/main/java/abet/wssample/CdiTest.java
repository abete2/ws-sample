package abet.wssample;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CdiTest {

	public String test(String arg) {
		return "test_" + arg;
	}
}
