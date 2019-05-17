package com.eviac.blog.powermock.env;

public class FooServiceImpl {

	/**
	 * method to be tested.
	 * @return
	 */
	public String doSomeFooStuff() {
		return System.getenv("FOO_VAR_1");
	}

}
